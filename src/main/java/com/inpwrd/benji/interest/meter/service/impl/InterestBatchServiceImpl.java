package com.inpwrd.benji.interest.meter.service.impl;

import com.inpwrd.benji.interest.meter.model.ArgumentWrapper;
import com.inpwrd.benji.interest.meter.model.MeasuredResultsWrapper;
import com.inpwrd.benji.interest.meter.model.MetricsWrapper;
import com.inpwrd.benji.interest.meter.service.InterestBatchService;
import com.inpwrd.benji.interest.meter.service.InterestService;
import io.vavr.collection.Stream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

@Service
public class InterestBatchServiceImpl implements InterestBatchService {

    public static String[] TOPICS = {"sports", "cars", "adventure", "movies", "celebrities", "fashion", "technology",
        "soccer", "finance"};
    private static final Logger LOG = LoggerFactory.getLogger(InterestBatchServiceImpl.class);
    private final InterestService[] interestSearchServices;

    @Autowired
    public InterestBatchServiceImpl(RestTemplate restTemplate, ApplicationContext applicationContext) {
        interestSearchServices = new InterestService[TOPICS.length];
        Stream.of(TOPICS).zipWithIndex().forEach(tuple -> {
            InterestService interestService = applicationContext.getBean(InterestService.class);
            interestService.setTopic(tuple._1());
            interestSearchServices[tuple._2()] = interestService;
        });
    }


    @Override
    public MeasuredResultsWrapper triggerInterestSearches(final ArgumentWrapper argumentWrapper) {
        final LocalDateTime start = LocalDateTime.now();
        List<MetricsWrapper> searchResults = this.processSearches(argumentWrapper);
        Map<String, Long> elapsedTimesPerTopic = this.calculateElapsedTimesPerTopic(searchResults);
        final LocalDateTime end = LocalDateTime.now();
        return MeasuredResultsWrapper.builder().startTime(start).endTime(end).result(elapsedTimesPerTopic)
            .createMetricsWrapper();
    }

    private Map<String, Long> calculateElapsedTimesPerTopic(List<MetricsWrapper> searchResults) {
        Map<String, Long> result = new HashMap<>();
        searchResults
            .forEach(searchResult -> result.put(searchResult.getResult().getTopic(), searchResult.getElapsedTime()));
        return result;
    }

    private List<MetricsWrapper> processSearches(final ArgumentWrapper argumentWrapper) {
        List<CompletableFuture<MetricsWrapper>> promises = this.buildPromises(argumentWrapper);
        CompletableFuture.allOf(promises.toArray(new CompletableFuture[TOPICS.length])).join();
        return promises.stream().map(promise -> {
            try {
                return promise.get();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            return null;
        }).collect(Collectors.toList());
    }

    private List<CompletableFuture<MetricsWrapper>> buildPromises(final ArgumentWrapper argumentWrapper) {
        return Stream.of(interestSearchServices).map(interestService -> interestService.fetchInterest(argumentWrapper))
            .toJavaList();
    }
}

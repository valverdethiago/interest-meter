package com.inpwrd.benji.interest.meter.service.impl;

import com.inpwrd.benji.interest.meter.model.ArgumentWrapper;
import com.inpwrd.benji.interest.meter.model.InterestResponseWrapper;
import com.inpwrd.benji.interest.meter.model.MetricsWrapper;
import com.inpwrd.benji.interest.meter.service.InterestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.concurrent.CompletableFuture;

@Component
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class InterestServiceImpl implements InterestService {

    private static final String REST_URL =
        "%s/channels/interest?q=%s&topRanking=50&refresh=%b";
    private static Logger LOG = LoggerFactory.getLogger(InterestServiceImpl.class);
    private final RestTemplate restTemplate;
    private String topic;

    public InterestServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    @Async
    public CompletableFuture<MetricsWrapper> fetchInterest(ArgumentWrapper argumentWrapper) {
        final String restUrl = this.buildRestUrl(argumentWrapper, topic);
        final LocalDateTime start = LocalDateTime.now();
        InterestResponseWrapper result = restTemplate.getForObject(restUrl, InterestResponseWrapper.class);
        result.setTopic(this.getTopic());
        final LocalDateTime end = LocalDateTime.now();
        MetricsWrapper metrics =
            MetricsWrapper.builder().startTime(start).endTime(end).result(result).createMetricsWrapper();
        return CompletableFuture.completedFuture(metrics);
    }

    private String buildRestUrl(ArgumentWrapper argumentWrapper, String topic) {
        return String.format(REST_URL, argumentWrapper.getBasePath(), topic,
            argumentWrapper.isRefreshCache());
    }

    public String getTopic() {
        return topic;
    }

    @Override
    public void setTopic(String topic) {
        this.topic = topic;
    }
}

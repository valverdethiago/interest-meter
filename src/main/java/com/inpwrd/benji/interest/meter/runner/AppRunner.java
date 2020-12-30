package com.inpwrd.benji.interest.meter.runner;

import com.inpwrd.benji.interest.meter.model.ArgumentWrapper;
import com.inpwrd.benji.interest.meter.model.MeasuredResultsWrapper;
import com.inpwrd.benji.interest.meter.service.InterestBatchService;
import com.inpwrd.benji.interest.meter.service.InterestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.net.*;

@Service
public class AppRunner implements CommandLineRunner {

    private static Logger LOG = LoggerFactory.getLogger(AppRunner.class);
    private final InterestBatchService interestBatchService;

    @Autowired
    public AppRunner(InterestBatchService interestBatchService) {
        this.interestBatchService = interestBatchService;
    }

    @Override
    public void run(String... args) throws Exception {
        LOG.info("EXECUTING : command line runner");
        ArgumentWrapper argumentWrapper = this.validateArgs(args);
        MeasuredResultsWrapper results = interestBatchService.triggerInterestSearches(argumentWrapper);
        LOG.info(results.toString());
    }

    private ArgumentWrapper validateArgs(String... args) {
        for (int i = 0; i < args.length; ++i) {
            LOG.info("args[{}]: {}", i, args[i]);
        }
        if (args.length < 2) {
            throw new IllegalArgumentException("You must specify at least 2 arguments to execute this");
        }
        final String basePath = args[0];
        final String refreshCache = args[1];
        this.validateUrl(basePath);
        this.validateBoolean(refreshCache);
        return
            ArgumentWrapper.builder().basePath(basePath).refreshCache(Boolean.valueOf(refreshCache)).build();
    }

    private void validateBoolean(String refreshCache) {
        if (!Boolean.parseBoolean(refreshCache)) {
            throw new IllegalArgumentException("Second Argument must be a boolean value [true|false]: " + refreshCache);
        }
    }

    private void validateUrl(String basePath) {
        try {
            new URL(basePath);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url provided as base path: " + basePath);
        }
    }
}

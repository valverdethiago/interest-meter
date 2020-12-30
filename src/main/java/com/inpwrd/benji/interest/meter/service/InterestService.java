package com.inpwrd.benji.interest.meter.service;

import com.inpwrd.benji.interest.meter.model.ArgumentWrapper;
import com.inpwrd.benji.interest.meter.model.InterestResponseWrapper;
import com.inpwrd.benji.interest.meter.model.MetricsWrapper;

import java.util.concurrent.CompletableFuture;

public interface InterestService {

    CompletableFuture<MetricsWrapper> fetchInterest(ArgumentWrapper wrapper);

    void setTopic(String topic);
}

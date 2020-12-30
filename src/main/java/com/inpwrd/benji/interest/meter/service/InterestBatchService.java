package com.inpwrd.benji.interest.meter.service;

import com.inpwrd.benji.interest.meter.model.ArgumentWrapper;
import com.inpwrd.benji.interest.meter.model.MeasuredResultsWrapper;

public interface InterestBatchService {

    MeasuredResultsWrapper triggerInterestSearches(ArgumentWrapper wrapper);
}

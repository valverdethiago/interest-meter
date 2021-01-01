package com.inpwrd.benji.interest.meter.model;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class MeasuredResultsWrapper {

    private final LocalDateTime startTime;
    private final LocalDateTime endTime;
    private final Map<String, Long> result;
    private long elapsedTime;

    public MeasuredResultsWrapper(LocalDateTime startTime, LocalDateTime endTime, Map<String, Long> result) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.result = result;
        this.calculate();
    }

    public static MeasuredResultsWrapperBuilder builder() {
        return new MeasuredResultsWrapperBuilder();
    }

    private void calculate() {
        this.elapsedTime = ChronoUnit.MILLIS.between(startTime, endTime);
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public long getElapsedTime() {
        return elapsedTime;
    }

    public Map<String, Long> getResult() {
        return result;
    }

    public static class MeasuredResultsWrapperBuilder {
        private LocalDateTime startTime;
        private LocalDateTime endTime;
        private Map<String, Long> result;

        public MeasuredResultsWrapperBuilder startTime(LocalDateTime startTime) {
            this.startTime = startTime;
            return this;
        }

        public MeasuredResultsWrapperBuilder endTime(LocalDateTime endTime) {
            this.endTime = endTime;
            return this;
        }

        public MeasuredResultsWrapperBuilder result(Map<String, Long> result) {
            this.result = result;
            return this;
        }

        public MeasuredResultsWrapper createMetricsWrapper() {
            return new MeasuredResultsWrapper(startTime, endTime, result);
        }
    }
}

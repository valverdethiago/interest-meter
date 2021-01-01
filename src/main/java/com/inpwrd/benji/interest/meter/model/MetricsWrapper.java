package com.inpwrd.benji.interest.meter.model;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class MetricsWrapper {

    private final LocalDateTime startTime;
    private final LocalDateTime endTime;
    private final InterestResponseWrapper result;
    private long elapsedTime;

    public MetricsWrapper(LocalDateTime startTime, LocalDateTime endTime, InterestResponseWrapper result) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.result = result;
        this.calculate();
    }

    public static MetricsWrapperBuilder builder() {
        return new MetricsWrapperBuilder();
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

    public InterestResponseWrapper getResult() {
        return result;
    }

    public static class MetricsWrapperBuilder {
        private LocalDateTime startTime;
        private LocalDateTime endTime;
        private InterestResponseWrapper result;

        public MetricsWrapperBuilder startTime(LocalDateTime startTime) {
            this.startTime = startTime;
            return this;
        }

        public MetricsWrapperBuilder endTime(LocalDateTime endTime) {
            this.endTime = endTime;
            return this;
        }

        public MetricsWrapperBuilder result(InterestResponseWrapper result) {
            this.result = result;
            return this;
        }

        public MetricsWrapper createMetricsWrapper() {
            return new MetricsWrapper(startTime, endTime, result);
        }
    }
}

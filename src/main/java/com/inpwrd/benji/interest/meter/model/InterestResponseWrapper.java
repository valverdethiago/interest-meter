package com.inpwrd.benji.interest.meter.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InterestResponseWrapper {

    private boolean success;
    private String topic;
    private List<InterestWrapper> data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<InterestWrapper> getData() {
        return data;
    }

    public void setData(List<InterestWrapper> data) {
        this.data = data;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}

package com.example.awsec2api.dto;

public class VMInfo {
    private String instanceId;
    private String state;

    public VMInfo(String instanceId, String state) {
        this.instanceId = instanceId;
        this.state = state;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
package com.example.awsec2api.dto;

public class VMCreationResponse {
    private String instanceId;

    public VMCreationResponse(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
}
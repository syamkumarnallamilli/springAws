package com.example.awsec2api.exception;

public class EC2Exception extends RuntimeException {
    public EC2Exception(String message) {
        super(message);
    }

    public EC2Exception(String message, Throwable cause) {
        super(message, cause);
    }
}
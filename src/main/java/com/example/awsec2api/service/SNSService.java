package com.example.awsec2api.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import software.amazon.awssdk.services.sns.SnsClient;
import software.amazon.awssdk.services.sns.model.PublishRequest;
import software.amazon.awssdk.services.sns.model.PublishResponse;
import software.amazon.awssdk.services.sns.model.SnsException;

@Service
public class SNSService {

    private static final Logger logger = LoggerFactory.getLogger(SNSService.class);

    private final SnsClient snsClient;

    @Autowired
    public SNSService(SnsClient snsClient) {
        this.snsClient = snsClient;
    }

    public String sendSms(String phoneNumber, String message) {
        try {
            PublishRequest request = PublishRequest.builder()
                    .message(message)
                    .phoneNumber(phoneNumber)
                    .build();

            PublishResponse result = snsClient.publish(request);
            logger.info("Message sent to {}. Message ID: {}", phoneNumber, result.messageId());
            return result.messageId();
        } catch (SnsException e) {
            logger.error("AWS SNS Exception: {}", e.awsErrorDetails().errorMessage());
            throw new RuntimeException("Failed to send SMS", e);
        } catch (Exception e) {
            logger.error("General Exception: {}", e.getMessage());
            throw new RuntimeException("Failed to send SMS", e);
        }
    }
}

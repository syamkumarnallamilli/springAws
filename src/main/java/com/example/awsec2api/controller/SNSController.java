package com.example.awsec2api.controller;

import com.example.awsec2api.service.SNSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sns")
public class SNSController {

    private final SNSService snsService;

    @Autowired
    public SNSController(SNSService snsService) {
        this.snsService = snsService;
    }

    @PostMapping("/sendSms")
    public ResponseEntity<String> sendSms(@RequestParam String phoneNumber, @RequestParam String message) {
        String messageId = snsService.sendSms(phoneNumber, message);
        return ResponseEntity.ok("SMS sent successfully. Message ID: " + messageId);
    }
}

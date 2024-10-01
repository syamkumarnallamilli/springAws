package com.example.awsec2api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "AWS EC2 API", version = "1.0", description = "API for managing AWS EC2 instances"))
public class AwsEc2ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(AwsEc2ApiApplication.class, args);
    }
}
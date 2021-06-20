package com.hxx.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.hxx.demo")
public class CloudNativeDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudNativeDemoApplication.class, args);
    }

}

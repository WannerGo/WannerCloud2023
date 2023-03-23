package com.wanner.storage.controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WannerStorageApplication {


    public static void main(String[] args) {
        SpringApplication.run(WannerStorageApplication.class, args);
    }

}

package com.wanner.order;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WannerOrderApplication {


    public static void main(String[] args) {
        SpringApplication.run(WannerOrderApplication.class, args);
    }

}

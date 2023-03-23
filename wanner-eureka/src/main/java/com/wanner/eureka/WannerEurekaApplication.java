package com.wanner.eureka;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WannerEurekaApplication {


    public static void main(String[] args) {
        SpringApplication.run(WannerEurekaApplication.class, args);
    }

}

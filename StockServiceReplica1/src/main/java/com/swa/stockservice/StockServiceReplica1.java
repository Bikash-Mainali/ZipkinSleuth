package com.swa.stockservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StockServiceReplica1 {

    public static void main(String[] args) {
        SpringApplication.run(StockServiceReplica1.class, args);
    }

}

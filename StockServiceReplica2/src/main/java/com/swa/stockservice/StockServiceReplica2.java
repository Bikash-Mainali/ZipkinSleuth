package com.swa.stockservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StockServiceReplica2 {

    public static void main(String[] args) {
        SpringApplication.run(StockServiceReplica2.class, args);
    }

}

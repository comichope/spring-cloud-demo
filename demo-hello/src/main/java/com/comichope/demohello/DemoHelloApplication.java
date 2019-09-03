package com.comichope.demohello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DemoHelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoHelloApplication.class, args);
    }

}


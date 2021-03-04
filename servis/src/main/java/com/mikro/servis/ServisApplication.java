package com.mikro.servis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServisApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServisApplication.class, args);
    }

}

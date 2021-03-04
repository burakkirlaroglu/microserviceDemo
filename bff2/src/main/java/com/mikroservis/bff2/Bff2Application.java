package com.mikroservis.bff2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Bff2Application {

    public static void main(String[] args) {
        SpringApplication.run(Bff2Application.class, args);
    }

}

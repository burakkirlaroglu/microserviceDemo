package com.mikroservis.bff2.client;

import com.mikroservis.bff2.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;

@FeignClient("user-service")
public interface UserServiceClient {

    @GetMapping("/api/user/{id}")
    User get(@PathVariable UUID id);
}

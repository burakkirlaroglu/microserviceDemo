package com.mikroservis.bff2.client;

import com.mikroservis.bff2.entity.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.UUID;

@FeignClient("order-service")
public interface OrderServiceClient {

    @GetMapping("/api/orders/{userId}")
    public List<Order> get(@PathVariable UUID userId);
}

package com.mikroservis.order.controller;

import com.mikroservis.order.entity.Order;
import com.mikroservis.order.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/order")
    public Order create(@RequestBody Order order){
        return orderService.create(order);
    }

    @GetMapping("/orders/{userId}")
    public List<Order> get(@PathVariable UUID userId){
        return orderService.get(userId);
    }

}

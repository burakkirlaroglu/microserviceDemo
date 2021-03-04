package com.mikroservis.order.service;

import com.mikroservis.order.entity.Order;
import com.mikroservis.order.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;

@Service
public class OrderService  {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order create(Order order){
        order.setId(UUID.randomUUID());
        order.setTotal(order.getTotal());
        order.setCreatedAt(LocalDate.now());
        order.setUserId(order.getUserId());
        orderRepository.save(order);
        return order;
    }

    public List<Order> get(UUID userId){
        return orderRepository.findByUserId(userId);
    }


}

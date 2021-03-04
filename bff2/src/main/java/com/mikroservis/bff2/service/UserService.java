package com.mikroservis.bff2.service;

import com.mikroservis.bff2.client.OrderServiceClient;
import com.mikroservis.bff2.client.UserServiceClient;
import com.mikroservis.bff2.entity.Order;
import com.mikroservis.bff2.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private final OrderServiceClient orderServiceClient;
    private final UserServiceClient userServiceClient;

    public UserService(OrderServiceClient orderServiceClient, UserServiceClient userServiceClient) {
        this.orderServiceClient = orderServiceClient;
        this.userServiceClient = userServiceClient;
    }

    public User get(UUID id){
        User user = userServiceClient.get(id);
        List<Order> orders = orderServiceClient.get(id);
        user.setOrders(orders);
        return user;
    }
}

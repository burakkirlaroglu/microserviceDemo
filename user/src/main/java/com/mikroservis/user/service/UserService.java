package com.mikroservis.user.service;

import com.mikroservis.user.entity.User;
import com.mikroservis.user.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User create(User user){
        user.setId(UUID.randomUUID());
        user.setName(user.getName());
        user.setUserName(user.getUserName());
        userRepository.save(user);
        return user;
    }

    public User get(UUID id){
        return userRepository.getById(id);
    }

}

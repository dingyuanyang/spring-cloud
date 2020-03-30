package com.example.user.service;

import com.example.user.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User findByName(String name) {
        if ("admin".equals(name)) {
            return new User(1L, name,"123456");
        } else {
            return null;
        }
    }
}

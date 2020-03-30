package com.example.sso.service;

import com.example.sso.model.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SsoService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "checkUserFall")
    public User checkUser(String name, String password) {

        String serverId = "USER";//服务名称
        User user = restTemplate.getForObject("http://" + serverId + "/api/v1/user/" + name, User.class);
        if (user != null) {
            if (user.getPwd().equals(password)) {
                return user;
            }
        }
        return null;
    }

    public User checkUserFall(String name, String password) {
        return new User(null, "调用失败", null);
    }
}

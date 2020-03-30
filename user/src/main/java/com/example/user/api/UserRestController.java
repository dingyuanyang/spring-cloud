package com.example.user.api;

import com.example.user.model.User;
import com.example.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController
public class UserRestController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{name}")
    public User findByName(@PathVariable("name") String name) throws Exception {
        User user = userService.findByName(name);
        if (user == null) {
            throw new Exception("用户不存在");
        }
        return user;
    }
}

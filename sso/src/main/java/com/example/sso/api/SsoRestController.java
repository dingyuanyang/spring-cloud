package com.example.sso.api;

import com.example.sso.bean.SsoResult;
import com.example.sso.model.User;
import com.example.sso.service.SsoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController
@RefreshScope //动态刷新配置
public class SsoRestController {

    @Autowired
    private SsoService ssoService;

    @GetMapping("/login/{username}/{password}")
    public SsoResult login(@PathVariable("username") String username, @PathVariable("password") String password) {
        User user = ssoService.checkUser(username, password);
        if(user !=null && user.getId()!=null){
            return new SsoResult(200,"登录成功",user);
        }
        return new SsoResult(404,"登录失败",user);
    }
}

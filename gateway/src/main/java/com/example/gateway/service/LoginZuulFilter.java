package com.example.gateway.service;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

@Component
public class LoginZuulFilter extends ZuulFilter {
    @Override
    public String filterType() {
        System.out.println("filterType");
        //过滤类型
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        //是否启用
        System.out.println("shouldFilter");
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("run filter");
        return null;
    }
}

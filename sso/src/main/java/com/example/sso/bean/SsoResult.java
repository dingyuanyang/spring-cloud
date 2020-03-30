package com.example.sso.bean;

import com.example.sso.model.User;

public class SsoResult {

    private Integer status;

    private String message;

    private User user;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public SsoResult(Integer status, String message, User user) {
        this.status = status;
        this.message = message;
        this.user = user;
    }
}

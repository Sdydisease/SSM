package com.atguigu.spting.controller;

import com.atguigu.spting.service.UserService;

/**
 * @author ldlstart
 * @create 2022-12-13-21:44
 */
public class UserController {

    private UserService userService;

    public void saveUser(){
        userService.saveUser();
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}

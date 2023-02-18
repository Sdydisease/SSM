package com.atguigu.spring.controller;

import com.atguigu.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author ldlstart
 * @create 2022-12-14-16:11
 */
//@Controller("controller")
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public void save(){
        userService.save();
    }
}

package com.atguigu.controller;

import com.atguigu.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author ldlstart
 * @create 2023-02-14-16:38
 */
@Controller
public class HelloController {

    @Autowired
    private HelloService helloService;

}

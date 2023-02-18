package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ldlstart
 * @create 2023-01-01-15:12
 */

/**
 * 2.创建请求控制器
 */
@Controller
public class HelloController {

    //服务器识别到匹配该value值的地址请求时跳到该方法
    //@RequestMapping注解的value属性可以通过请求地址匹配请求，/表示的当前工程的上下文路径 ==> localhost:8080/springMVC/
    @RequestMapping("/")
    public String portal(){
        //将逻辑视图返回
        return "index";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }



}

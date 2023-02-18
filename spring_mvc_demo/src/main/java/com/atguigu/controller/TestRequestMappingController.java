package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;

/**
 * @author ldlstart
 * @create 2023-01-02-15:05
 *
 * 1、@RequestMapping注解标识的位置
 *      @RequestMapping标识一个类：设置映射请求的请求路径的初始信息
 *      @RequestMapping标识一个方法：设置映射请求请求路径的具体信息
 * 2、@RequestMapping注解的value属性
 *      作用：通过请求的请求路径匹配请求
 *      value属性是数组类型，既若当前浏览器所发送请求的请求路径匹配value属性中的任何一个值，则当前请求就会被注解所标识的方法进行处理。
 * 3、@RequestMapping注解的method属性
 *      作用：通过请求的请求方式匹配请求
 *      method属性是RequestMethod类型的数组，既当前浏览器所发送请求的请求方式匹配method属性中的任何一种值，则当前请求就会被注解所标识的方法进行处理。
 *      若浏览器所发送的请求路径和@RequestMapping注解的value属性匹配，但是请求方式不匹配，则页面报错：Request method 'GET' not supported。
 * 7、@RequestMapping注解使用路径中的占位符
 *      传统方法：/deleteUser?id=1
 *      rest：/user/delete/1
 *      需要在@RequestMapping注解的value属性中所设置的路径中，使用{xxx}的方式表示路径中的数据再通过@PathVariable注解，将占位符所标识的值和控制器方法的形参进行绑定
 */
@Controller
//@RequestMapping("/test")
public class TestRequestMappingController {

//    @RequestMapping(
//            value = {"/hello","/abc"},
//            method = {RequestMethod.POST}
//    )
//    public String hello(){
//        return "success_post";
//    }
    @PostMapping(
            value = {"/hello","/abc"}
//            params = {"username","password=123456"}
    )
    public String hello(){
        return "success_post";
    }


    @RequestMapping(
            value = {"/hello","/abc"},
            method = {RequestMethod.GET}
    )
    public String hello2(){
        return "success";
    }


//    @RequestMapping(
//            value = "/a?a/test/ant"
//    )
//    @RequestMapping(
//            value = "/a*a/test/ant"
//    )
    @RequestMapping(
            value = "/**/test/ant"
    )
    public String testAnt(){
        return "success";
    }


    @RequestMapping("/test/rest/{id}/{password}")
    public String testRest(@PathVariable("id") String id,@PathVariable("password") String password){
        System.out.println("id=" + id + ",password=" + password);
        return "success";
    }
}

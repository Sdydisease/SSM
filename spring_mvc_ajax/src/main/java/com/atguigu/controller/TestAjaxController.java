package com.atguigu.controller;

import com.atguigu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ldlstart
 * @create 2023-02-11-15:57
 *
 * 1、@RequestBody：将请求体中的内容和控制器方法的形参进行绑定
 *
 */
@Controller
public class TestAjaxController {

    @RequestMapping("/test/RequestBody")
    public String testRequestBody(@RequestBody String requestBody) {
        System.out.println("requestBody:" + requestBody);//requestBody:username=11&password=11
        return "success";
    }

    //将json格式的数据转换为map集合
    @RequestMapping("/test/RequestBody/json")
    public void testRequestBody(@RequestBody User user,HttpServletResponse response) throws IOException {
        System.out.println(user);
        response.getWriter().print("hello,axios");
    }


    public void testRequestBody(@RequestBody Map<String, Object> map,
                                HttpServletResponse response) throws IOException {
        System.out.println(map);
//{username=admin, password=123456}
        response.getWriter().print("hello,axios");
    }


    @RequestMapping("/test/ResponseBody/json")
    @ResponseBody
    public Map<String,Object> testResponseBody(){
        User user1 = new User("1", "a", "1111", 12);
        User user2 = new User("2", "a", "1111", 12);
        User user3 = new User("3", "a", "1111", 12);
        Map<String, Object> map = new HashMap<>();
        map.put("user1",user1);
        map.put("user2",user2);
        map.put("user3",user3);
        return map;
    }


//    public User testResponseBody(){
//        User user = new User("1", "a", "1111", 12);
//        return user;
//    }
}

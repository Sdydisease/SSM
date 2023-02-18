package com.atguigu.spring.test;

import com.atguigu.spting.controller.UserController;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ldlstart
 * @create 2022-12-13-21:57
 */
public class AutoWireTest {

    @Test
    public void testAutoWireByXML(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-autowire-xml.xml");

        UserController userController = ioc.getBean(UserController.class);
        userController.saveUser();


    }
}

package com.atguigu.spring.test;

import com.atguigu.spring.controller.UserController;
import com.atguigu.spring.dao.UserDao;
import com.atguigu.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ldlstart
 * @create 2022-12-14-16:15
 */
public class IOCByAnnotationTest {

    @Test
    public void testAutoWired(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");

        UserController userController = ioc.getBean(UserController.class);

        userController.save();

    }

    @Test
    public void test(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");

//        UserController userController = ioc.getBean("controller",UserController.class);
        UserController userController = ioc.getBean("userController",UserController.class);
        System.out.println(userController);

        UserService userService = ioc.getBean("userServiceImpl",UserService.class);
        System.out.println(userService);

        UserDao userDao = ioc.getBean("userDaoImpl",UserDao.class);
        System.out.println(userDao);
    }
}

package com.atguigu.spring.test;

import com.atguigu.spting.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ldlstart
 * @create 2022-12-11-17:10
 */
public class ScopeTest {
    @Test
    public void testScope(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-scope.xml");

        User user1 = ioc.getBean(User.class);
        User user2 = ioc.getBean(User.class);
        System.out.println(user1==user2);
    }
}

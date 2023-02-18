package com.atguigu.spring.test;

import com.atguigu.spting.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ldlstart
 * @create 2022-12-13-17:43
 */
public class FactoryBeanTest {

    @Test
    public void test(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-factorybean.xml");
        User user = ioc.getBean(User.class);
        System.out.println(user);


    }
}

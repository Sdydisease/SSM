package com.atguigu.spring.test;

import com.atguigu.spting.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ldlstart
 * @create 2022-12-13-16:58
 */
public class LifecycleTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-lifecycle.xml");
        User user = ioc.getBean(User.class);

        user.destroyMethod();


        User user2 = ioc.getBean(User.class);
        user2.destroyMethod();
        ioc.close();



    }
}

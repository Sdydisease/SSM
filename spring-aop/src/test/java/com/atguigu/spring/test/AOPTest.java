package com.atguigu.spring.test;

import com.atguigu.spring.aop.annotation.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ldlstart
 * @create 2022-12-26-14:48
 */
public class AOPTest {

    @Test
    public void testAopByAnnotation(){
        ApplicationContext aoc = new ClassPathXmlApplicationContext("aop-annotation.xml");
        //通过接口获取代理对象
        Calculator calculator = aoc.getBean(Calculator.class);
        calculator.div(19,8);
    }
}

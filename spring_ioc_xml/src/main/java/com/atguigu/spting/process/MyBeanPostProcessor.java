package com.atguigu.spting.process;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author ldlstart
 * @create 2022-12-13-17:14
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("3.后置处理器在bean初始化之前的操作");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("5.后置处理器在bean初始化之后的操作");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}

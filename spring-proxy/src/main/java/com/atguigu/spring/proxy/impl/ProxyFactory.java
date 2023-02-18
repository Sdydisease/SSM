package com.atguigu.spring.proxy.impl;

import java.lang.reflect.*;
import java.util.Arrays;

/**
 * @author ldlstart
 * @create 2022-12-25-19:45
 */
public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxy(){
        ClassLoader classLoader = target.getClass().getClassLoader();
        Class[] interfaces = target.getClass().getInterfaces();
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = null;
                try {
                    System.out.println("日志，方法" + method.getName() + "，参数：" + Arrays.toString(args));
                    //在代理类对象方法中执行目标对象核心方法
                    result = method.invoke(target, args);
                    System.out.println("日志，方法" + method.getName() + "，结果：" + result);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("日志，方法" + method.getName() +"，异常：" + e);
                } finally {
                    System.out.println("日志，方法" + method.getName() +"，执行完毕");
                }
                return result;
            }
        };
        return Proxy.newProxyInstance(classLoader,interfaces,invocationHandler);
    }
}

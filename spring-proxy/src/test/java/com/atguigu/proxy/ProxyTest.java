package com.atguigu.proxy;

import com.atguigu.spring.proxy.Calculator;
import com.atguigu.spring.proxy.impl.CalculatorImpl;
import com.atguigu.spring.proxy.impl.CalculatorStaticProxy;
import com.atguigu.spring.proxy.impl.ProxyFactory;
import org.junit.Test;

/**
 * @author ldlstart
 * @create 2022-12-16-20:55
 */
public class ProxyTest {

    @Test
    public void test(){
//        CalculatorStaticProxy csp = new CalculatorStaticProxy(new CalculatorImpl());

//        csp.add(1,3);
//        csp.mul(2,4);

        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        proxy.add(1, 2);
    }
}

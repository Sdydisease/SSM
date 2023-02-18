package com.atguigu.spring.service;

/**
 * @author ldlstart
 * @create 2022-12-28-16:25
 */
public interface CheckoutService {
    void checkOut(Integer userId, Integer[] bookIds);
}

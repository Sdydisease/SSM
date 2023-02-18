package com.atguigu.spring.controller;

import com.atguigu.spring.dao.BookDao;
import com.atguigu.spring.service.BookService;
import com.atguigu.spring.service.CheckoutService;
import com.atguigu.spring.service.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author ldlstart
 * @create 2022-12-27-18:51
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private CheckoutService checkoutService;

    /**
     * 买书
     */
    public void buyBook(Integer userId, Integer bookId) {
        bookService.buyBook(userId, bookId);
    }

    /**
     * 结账
     */
    public void checkOut(Integer userId, Integer[] bookIds) {
        checkoutService.checkOut(userId, bookIds);
    }

}

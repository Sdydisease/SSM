package com.atguigu.spring.test;

import com.atguigu.spring.controller.BookController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ldlstart
 * @create 2022-12-27-20:17
 *
 * 声明式事务的配置步骤：
 *      1.在spring的配置文件中配置事务管理器
 *      2.开启事务的注解驱动
 *      在需要被事务管理的方法上，添加@Transactional注解，该方法就会被事务管理
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:tx-annotation.xml")
public class TxByAnnotationTest {

    @Autowired
    private BookController bookController;

    @Test
    public void testBuyBook(){
        bookController.buyBook(1,2);
    }

    @Test
    public void testCheckout(){
        Integer[] bookIds = new Integer[]{1,2};
        bookController.checkOut(1,bookIds);
    }
}

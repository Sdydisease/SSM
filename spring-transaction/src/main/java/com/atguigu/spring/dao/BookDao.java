package com.atguigu.spring.dao;

/**
 * @author ldlstart
 * @create 2022-12-27-18:52
 */
public interface BookDao {
    Integer getPriceByBookId(Integer bookId);

    void updateStock(Integer bookId);

    void updateBlance(Integer userId, Integer price);
}

package com.atguigu.spring.dao.Impl;

import com.atguigu.spring.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author ldlstart
 * @create 2022-12-14-16:13
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("保存成功");
    }
}

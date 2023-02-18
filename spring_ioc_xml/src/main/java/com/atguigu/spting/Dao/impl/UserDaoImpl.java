package com.atguigu.spting.Dao.impl;

import com.atguigu.spting.Dao.UserDao;

import java.awt.print.PrinterAbortException;

/**
 * @author ldlstart
 * @create 2022-12-13-21:47
 */
public class UserDaoImpl implements UserDao {

    @Override
    public void saveUser() {
        System.out.println("成功保存User到数据库中");
    }
}

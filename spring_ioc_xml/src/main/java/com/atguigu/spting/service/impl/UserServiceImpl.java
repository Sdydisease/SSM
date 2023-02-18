package com.atguigu.spting.service.impl;

import com.atguigu.spting.Dao.UserDao;
import com.atguigu.spting.Dao.impl.UserDaoImpl;
import com.atguigu.spting.service.UserService;

/**
 * @author ldlstart
 * @create 2022-12-13-21:46
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}

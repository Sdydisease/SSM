package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;

import java.util.List;

/**
 * @author ldlstart
 * @create 2022-12-03-19:31
 */
public interface UserMapper {

    /**
     * 添加用户信息，返回值为int类型
     * @return
     */
    int insertUser();

    /**
     * 修改用户信息
     */
    void updateUser();

    /**
     * 删除用户信息
     */
    void deleteUser();

    /**
     * 通过id值返回指定User对象
     * @return
     */
    User getUserById();

    /**
     * 获取所有User对象
     * @return
     */
    List<User> getAllUser();
}

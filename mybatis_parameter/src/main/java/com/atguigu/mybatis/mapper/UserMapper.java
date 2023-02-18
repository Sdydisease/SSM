package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * @author ldlstart
 * @create 2022-12-04-20:05
 */
public interface UserMapper {

    /**
     * 通过username查询user
     *
     * @return
     */
    User getUserForUsername(String username);

    /**
     * 登录验证
     *
     * @param username
     * @param password
     * @return
     */
    User checkLogin(String username, String password);

    /**
     * 验证登录(以map集合为访问参数)
     *
     * @param map
     * @return
     */
    User checkLoginByMap(Map<String, Object> map);

    /**
     * 添加用户
     *
     * @param user
     */
    void insertUser(User user);

    /**
     * 登录验证（通过@param注解方式）
     * @param username
     * @param password
     * @return
     */
    User checkLoginByParam(@Param("username") String username, @Param("password") String password);
}

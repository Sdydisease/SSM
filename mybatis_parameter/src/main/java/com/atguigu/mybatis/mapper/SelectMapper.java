package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author ldlstart
 * @create 2022-12-05-19:15
 */
public interface SelectMapper {

    /**
     * 通过id查询User
     * @param id
     * @return
     */
    User getUserById(@Param("id") Integer id);

    /**
     * 获取所有User
     * @return
     */
    List<User> getAllUser();

    /**
     * 获取总字段数
     * @return
     */
    Integer getCount();

    /**
     * 通过id查询User，返回map
     * @param id
     * @return
     */
    Map<String,Object> getUserByIdToMap(@Param("id") Integer id);

    /**
     * 查询所有User用map接收
     * @return
     */
//    List<Map<String,Object>> getAllUserToMap();
    @MapKey("id")
    Map<String,Object> getAllUserToMap();

}

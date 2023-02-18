package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author ldlstart
 * @create 2022-12-05-20:53
 */
public interface SpecialSQLMapper {


    /**
     * 模糊查询User
     * @param mohu
     * @return
     */
    List<User> getUserByLike(@Param("mohu") String mohu);


    /**
     * 批量删除
     * @param ids
     */
    void deleteMore(@Param("ids") String ids);

    /**
     * 动态设置表名
     * @param tableName
     * @return
     */
    List<User> getUserByTable(@Param("tableName") String tableName);

    /**
     * 调用自增的主键，并保存
     * @param user
     */
    void insertUser(User user);
}

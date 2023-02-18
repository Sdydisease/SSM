package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.SpecialSQLMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author ldlstart
 * @create 2022-12-05-20:54
 */
public class SpecialSQLMapperTest {


    @Test
    public void testGetUserByLike(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);

        List<User> list = mapper.getUserByLike("a");

        list.forEach(System.out::println);
    }

    @Test
    public void testDeleteMore(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);

        mapper.deleteMore("11,12");
    }

    @Test
    public void testGetUserByTable(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        List<User> list = mapper.getUserByTable("t_user");
        list.forEach(System.out::println);
    }

    @Test
    public void testInsertUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        User user = new User(null,"lili","123456",23,"男","lili@qq.com");
        mapper.insertUser(user);
        System.out.println(user);//User{id=15, username='lili', password='123456', age=23, gender='男', email='lili@qq.com'}
    }

}

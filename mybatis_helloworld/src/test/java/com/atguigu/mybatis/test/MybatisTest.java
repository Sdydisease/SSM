package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.UserMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author ldlstart
 * @create 2022-12-03-20:12
 */
public class MybatisTest {

    @Test
    public void testInsert() throws IOException {

        //获取核心配置文件的输入流
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        //获取sqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

        //获取sqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);

        //获取sql的会话对象sqlSession————是MyBatis提供的操作数据库的对象
        //创建SqlSession对象，此时通过SqlSession对象所操作的sql都会自动提交
        //SqlSession sqlSession = sqlSessionFactory.openSession(true);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //获取UserMapper接口的代理实现类对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        //调用mapper接口中的方法，实现添加用户信息的功能
        int i = mapper.insertUser();
        System.out.println("结果：" + i);

        sqlSession.commit();
        sqlSession.close();
    }



    @Test
    public void updateTest(){
        //获取sqlSession对象
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        //获取UserMapper接口的代理实现类对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //调用mapper接口的updateUser方法
        mapper.updateUser();

        //关闭sqlSession
        sqlSession.close();
    }


    @Test
    public void deleteTest(){
        //获取sqlSession对象
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        //获取UserMapper接口的代理实现类对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //调用mapper接口的updateUser方法
        mapper.deleteUser();

        //关闭sqlSession
        sqlSession.close();
    }

    @Test
    public void getUserByIdTest(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById();
        System.out.println(user);
    }


    @Test
    public void getAllUserTest(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = mapper.getAllUser();
        list.forEach(System.out::println);
    }
}

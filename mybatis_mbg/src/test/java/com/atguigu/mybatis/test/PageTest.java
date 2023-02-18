package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author ldlstart
 * @create 2022-12-09-15:54
 */
public class PageTest {

    @Test
    public void testPage() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);

        //查询功能之前开启分页功能
        PageHelper.startPage(1,4);
        List<Emp> list = mapper.selectByExample(null);
        //查询功能之后获取分页相关数据
        PageInfo<Emp> pageInfo = new PageInfo<>(list, 5);
        System.out.println(pageInfo);
//        list.forEach(System.out::println);
    }
}

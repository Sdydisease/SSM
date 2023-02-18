package com.atguigu.mybatis.Test;

import com.atguigu.mybatis.mapper.DynamicSqlMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * @author ldlstart
 * @create 2022-12-07-20:22
 */
public class DynamicSqlMapperTest {

    @Test
    public void testGetEmpByCondition(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);
        Emp emp = new Emp(null, "张三", 20, "");
        List<Emp> list = mapper.getEmpByCondition(emp);
        list.forEach(System.out::println);
    }

    @Test
    public void testInsertMoreEmp(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);
        Emp emp1 = new Emp(null, "张三", 20, "男");
        Emp emp2 = new Emp(null, "张三", 20, "男");
        Emp emp3 = new Emp(null, "张三", 20, "男");
        Emp emp4 = new Emp(null, "张三", 20, "男");
        List<Emp> emps = Arrays.asList(emp1, emp2, emp3, emp4);
        mapper.insertMoreEmp(emps);
    }

    @Test
    public void testDeleteMoreEmp(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);
        Integer[] empIds = new Integer[]{5, 6, 7};

        mapper.deleteMoreEmp(empIds);
    }
}

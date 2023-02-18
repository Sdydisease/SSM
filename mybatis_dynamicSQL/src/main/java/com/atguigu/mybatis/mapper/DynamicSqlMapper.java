package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author ldlstart
 * @create 2022-12-07-19:10
 */
public interface DynamicSqlMapper {

    /**
     * 根据添加的信息查询员工信息
     * @param emp
     * @return
     */
    List<Emp> getEmpByCondition(Emp emp);

    /**
     * 批量插入员工（foreach）
     * @param emps
     */
    void insertMoreEmp(@Param("emps") List<Emp> emps);

    /**
     * 批量删除员工
     * @param empIds
     */
    void deleteMoreEmp(@Param("empIds") Integer[] empIds);
}

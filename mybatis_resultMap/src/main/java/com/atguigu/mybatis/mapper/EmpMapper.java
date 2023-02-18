package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author ldlstart
 * @create 2022-12-06-17:29
 */
public interface EmpMapper {

    /**
     * 根据id查询员工信息
     * @param empId
     * @return
     */
    Emp getEmpByEmpId(@Param("empId") Integer empId);


    /**
     * 查询emp表和dept表
     * @param empId
     * @return
     */
    Emp getEmpAndDeptById(@Param("empId") Integer empId);

    /**
     * 通过分步查询查询员工以及所对应的部门信息的第一步
     * @param empId
     * @return
     */
    Emp getEmpAndDeptByStepOne(@Param("empId") Integer empId);

    /**
     * 通过部门id分步查询部门信息第二步
     * @param deptId
     * @return
     */
    List<Emp> getDeptAndEmoByStepTwo(@Param("deptId") Integer deptId);
}

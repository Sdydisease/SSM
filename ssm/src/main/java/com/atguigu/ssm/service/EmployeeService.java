package com.atguigu.ssm.service;

import com.atguigu.ssm.pojo.Employee;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author ldlstart
 * @create 2023-02-14-21:31
 */
public interface EmployeeService {
    /*
    * 获取所有员工信息
    * */
    List<Employee> getAllEmployee();

    /*
    * 获取分页信息
    * */
    PageInfo<Employee> getEmployeePage(Integer pageNum);
}

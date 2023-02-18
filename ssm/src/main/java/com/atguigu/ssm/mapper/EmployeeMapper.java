package com.atguigu.ssm.mapper;

import com.atguigu.ssm.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.security.PrivateKey;
import java.util.List;
import java.util.PrimitiveIterator;

/**
 * @author ldlstart
 * @create 2023-02-15-16:47
 */

public interface EmployeeMapper {

    List<Employee> getAllEmployee();
}

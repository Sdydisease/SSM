package com.atguigu.ssm.controller;

import com.atguigu.ssm.pojo.Employee;
import com.atguigu.ssm.service.EmployeeService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author ldlstart
 * @create 2023-02-14-21:15
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/employee/page/{pageNum}")
    public String getEmployeePage(@PathVariable Integer pageNum,Model model){
        //获得员工的分页信息
        PageInfo<Employee> page = employeeService.getEmployeePage(pageNum);
        //将分页数据共享到请求域中
        model.addAttribute("page",page);
        String str = new String("test");
        String str1 = new String("hot-fix");
        String str2 = new String("master test");
        String str3 = new String("hot-fix test");
        String str4 = new String("github test");

        //跳转到分页页面
        return "employee_list";

    }

    @RequestMapping(value = "/employee",method = RequestMethod.GET)
    public String getAllEmployee(Model model){
            List<Employee> list = employeeService.getAllEmployee();

        model.addAttribute("list",list);
        return "employee_list";
    }

}

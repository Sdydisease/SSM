package com.atguigu.controller;

import com.atguigu.dao.EmployeeDao;
import com.atguigu.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import sun.text.normalizer.UBiDiProps;

import java.util.Collection;

/**
 * @author ldlstart
 * @create 2023-02-01-14:18
 *
 * 查询所有的员工信息-->/employee-->get
 * 跳转到添加页面-->/to/add-->get
 * 新增员工信息-->/employee-->post
 * 跳转到修改页面-->/employee/1-->get
 * 修改员工信息-->/employee-->put
 * 删除员工信息-->/employee/1-->delete
 *
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping(value = "/employee",method = RequestMethod.GET)
    public String getAllEmployee(Model model){
        //获取所有的员工信息
        Collection<Employee> allEmployee = employeeDao.getAll();
        //将所有的员工信息在请求域中共享
        model.addAttribute("allEmployee",allEmployee);
        return "employee_list";
    }

    @RequestMapping(value = "/employee",method = RequestMethod.POST)
    public String addEmployee(Employee employee){
        //获取请求参数并保存到集合中
        employeeDao.save(employee);
        //重定向到列表功能：/employee
        return "redirect:/employee";
    }



    @RequestMapping(value = "/to/add",method = RequestMethod.GET)
    public String toAddPage(){
        return "employee_add";
    }

    @RequestMapping(value = "/employee/{id}",method = RequestMethod.GET)
    public String toUpdatePage(@PathVariable("id") Integer id, Model model){
        Employee employee = employeeDao.get(id);
        model.addAttribute("employee",employee);
        return "employee_update";
    }


    @RequestMapping(value = "/employee",method = RequestMethod.PUT)
    public String updateEmployee(Employee employee){
        employeeDao.save(employee);
        return "redirect:/employee";
    }


}

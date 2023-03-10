package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import sun.text.normalizer.UBiDiProps;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

/**
 * @author ldlstart
 * @create 2023-01-08-15:54
 *  向域对象共享数据
 *  1、通过ModelAndView向请求域共享数据
 *      使用ModelAndView时，可以使用其Model功能向请求域共享数据
 *      使用View功能设置逻辑视图，但是控制器方法一定要将ModelAndView对象作为方法的返回值
 *
 */
@Controller
public class TestScopeController {

    @RequestMapping("/test/mav")
    public ModelAndView testMAV(){
        /**
         * ModelAndView包含Model和View的功能
         * Model：向请求域中共享数据
         * View：设置逻辑视图实现页面跳转
         */
        ModelAndView mav = new ModelAndView();
        //向请求域中共享数据
        mav.addObject("testRequestScope","hello,ModelAndView");
        //设置逻辑视图
        mav.setViewName("success");
        //返回一个ModelAndView对象
        return mav;
    }

    @RequestMapping("/test/model")
    public String testModel(Model model){
        model.addAttribute("testRequestScope","hello,Model");
        return "success";
    }

    @RequestMapping("/test/session")
    public String testSession(HttpSession session){
        session.setAttribute("testSessionScope","hello,session");
        return "success";
    }

    @RequestMapping("/test/application")
    public String testApplication(HttpSession session){
        ServletContext servletContext = session.getServletContext();
        servletContext.setAttribute("testApplicationScope","hello,application");
        return "success";
    }

}

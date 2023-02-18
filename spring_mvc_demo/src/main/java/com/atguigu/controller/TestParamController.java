package com.atguigu.controller;

import com.atguigu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ldlstart
 * @create 2023-01-06-19:29
 *
 * 获取请求参数的方式：
 *      1、通过servletAPI获取（在控制器方法的形参中设置HttpServletRequest类型的形参即可使用request对象获取请求参数）
 *      2、通过控制器方法的形参获取
 *          只需要在控制器方法的形参位置，设置一个形参，形参的名字和请求参数的名字一致即可
 *      3、@RequestParam：将请求参数和控制器方法的形参绑定
 *         @RequestParam注解的三个属性：value,required,defaultValue
 *              value:设置和形参绑定的请求参数的名字
 *              required：设置是否必须传输value所对应的请求参数，默认值为true。若未传输，则报错400
 *              defaultValue：设置value所对应的请求参数的默认值
 *      4、@RequestHeader：将请求头信息和控制器方法的形参绑定
 *      5、@CookieValue：将cookie数据和控制器方法的形参绑定
 *      6、通过控制器方法的实体类类型的形参获取请求参数：需要在控制器方法的形参位置设置实体类类型的形参，要保证实体类中的
 *          属性名和请求参数的名字一致，可以通过实体类类型的形参获取请求参数
 *      7、解决获取请求参数的乱码问题
 *          get请求Tomcat自动避免了乱码
 *          post请求需自己配置：在web.xml中配置Spring的编码过滤器CharacterEncodingFilter。
 *
 */
@Controller
public class TestParamController {

    @RequestMapping(value = "/param/servletAPI")
    public String getParamByServletAPI(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username:"+username+",password:"+password);
        return "success";
    }

    @RequestMapping("/param")
    public String getParam(@RequestParam(value = "userName",defaultValue = "hello") String username, String password){
        System.out.println("username1:"+username+",password1:"+password);
        return "success";
    }

    @RequestMapping("/param/pojo")
    public String getParamByPojo(User user){
        System.out.println(user);//User{id=null, password='123455', username='admin'}
        return "success";
    }


}

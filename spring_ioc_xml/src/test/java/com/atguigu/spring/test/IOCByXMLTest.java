package com.atguigu.spring.test;

import com.atguigu.spting.pojo.Clazz;
import com.atguigu.spting.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author ldlstart
 * @create 2022-12-09-19:38
 */
public class IOCByXMLTest {

    @Test
    public void testDataSource() throws SQLException {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-datasource.xml");
        DataSource source = ioc.getBean(DataSource.class);
        System.out.println(source.getConnection());
    }

    @Test
    public void testDI(){
        //获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        //通过IOC容器获得bean
        Student student = ioc.getBean("studentFour", Student.class);
//        System.out.println(student);
//        System.out.println(studentTwo.getGender().toString());

        Clazz clazzOne = ioc.getBean("clazzOne", Clazz.class);
//        System.out.println(clazzOne);

        System.out.println(student);
    }

    @Test
    public void testIOC(){
        //获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        //通过IOC容器获得bean
//        Student studentOne = (Student) ioc.getBean("studentOne");
//        Student studentOne = (Student) ioc.getBean(Student.class);
        Student studentOne = (Student) ioc.getBean("studentOne",Student.class);
        System.out.println(studentOne);
    }
}

package com.atguigu.spting.factory;

import com.atguigu.spting.pojo.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author ldlstart
 * @create 2022-12-13-17:40
 */
public class UserFactoryBean implements FactoryBean<User> {

    @Override
    public User getObject() throws Exception {
        //返回一个对象交给IOC容器管理
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        //设置所提供对象的类型
        return User.class;
    }
}

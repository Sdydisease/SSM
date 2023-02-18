package com.atguigu.spting.pojo;

/**
 * @author ldlstart
 * @create 2022-12-11-17:05
 */
public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer age;

    public User() {
        System.out.println("1.创建对象");
    }

    public User(Integer id, String username, String password, Integer age) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
        System.out.println("2.依赖注入");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }

    public void initMethod(){
        System.out.println("4.初始化");
    }

    public void destroyMethod(){
        System.out.println("6.销毁");
    }
}
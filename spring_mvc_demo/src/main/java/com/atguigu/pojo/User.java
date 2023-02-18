package com.atguigu.pojo;

/**
 * @author ldlstart
 * @create 2023-01-07-16:00
 */
public class User {

    private Integer id;

    private String password;

    private String username;

    public User() {
    }

    public User(Integer id, String password, String username) {
        this.id = id;
        this.password = password;
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}

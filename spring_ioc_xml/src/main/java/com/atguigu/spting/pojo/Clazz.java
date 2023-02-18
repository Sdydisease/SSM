package com.atguigu.spting.pojo;

import java.util.List;

/**
 * @author ldlstart
 * @create 2022-12-10-20:12
 */
public class Clazz {

    private Integer cid;

    private String cname;

    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", students=" + students +
                '}';
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Clazz(Integer cid, String cname, List<Student> students) {
        this.cid = cid;
        this.cname = cname;
        this.students = students;
    }

    public Clazz() {
    }

    public Clazz(Integer cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

}

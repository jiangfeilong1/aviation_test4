package com.cn.test.entity;

public class Jing {
    private String username;
    private Integer id;
    private Float zhanghu;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getZhanghu() {
        return zhanghu;
    }

    public void setZhanghu(Float zhanghu) {
        this.zhanghu = zhanghu;
    }

    @Override
    public String toString() {
        return "Jing{" +
                "username='" + username + '\'' +
                ", id=" + id +
                ", zhanghu=" + zhanghu +
                '}';
    }
}

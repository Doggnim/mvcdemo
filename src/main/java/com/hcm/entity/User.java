package com.hcm.entity;

import lombok.Data;

/**
 * @Author Chuming Huang
 * @Date 2020/8/20
 */
public class User {

    /**
     * 用户id
     */
    private int id;

    /**
     * 用户姓名
     */
    private String name;

    /**
     * 用户性别
     * 0为女, 1为男
     */
    private int sex;

    /**
     * 用户年龄
     */
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}

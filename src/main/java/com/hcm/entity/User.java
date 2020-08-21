package com.hcm.entity;

import lombok.Data;

/**
 * @Author Chuming Huang
 * @Date 2020/8/20
 */
@Data
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

}

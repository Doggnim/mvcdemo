package com.hcm;

import com.hcm.controller.UserController;
import com.hcm.entity.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Chuming Huang
 * @Date 2020/8/20
 */
@MapperScan("com.hcm.dao")
public class MvcDemoApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        UserController userController = context.getBean(UserController.class);
        User user = userController.getUserById(4);
        System.out.println(user);
    }
}

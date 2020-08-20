package com.hcm;

import com.hcm.controller.HelloController;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.ApplicationContext;
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
        HelloController helloController = (HelloController) context.getBean("HelloController");
        helloController.sayHello();
    }
}

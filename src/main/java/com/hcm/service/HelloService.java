package com.hcm.service;

import org.springframework.stereotype.Service;

/**
 * @Author Chuming Huang
 * @Date 2020/8/20
 */
@Service
public class HelloService {

    public String sayHello() {
        return "Hello MVC!";
    }

}

package com.hcm.controller;

import com.hcm.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Chuming Huang
 * @Date 2020/8/20
 */
@RestController
@RequestMapping("/mvc")
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/hello")
    public String sayHello() {
        return helloService.sayHello();
    }



}

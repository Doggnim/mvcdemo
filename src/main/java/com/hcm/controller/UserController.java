package com.hcm.controller;

import com.hcm.entity.User;
import com.hcm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Chuming Huang
 * @Date 2020/8/20
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/get")
    public User getUserById(@RequestParam("id") int id) {
        return userService.findUserById(id);
    }

}

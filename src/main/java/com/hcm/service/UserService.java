package com.hcm.service;

import com.hcm.dao.UserMapper;
import com.hcm.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author Chuming Huang
 * @Date 2020/8/20
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public User findUserById(int id) {
        return userMapper.selectUserById(id);
    }

}

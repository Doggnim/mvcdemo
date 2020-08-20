package com.hcm.dao;

import com.hcm.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author Chuming Huang
 * @Date 2020/8/20
 */
@Mapper
public interface UserMapper {
    /**
     * 根据用户id找出用户
     * @param id
     * @return user
     */
    User selectUserById(int id);
}

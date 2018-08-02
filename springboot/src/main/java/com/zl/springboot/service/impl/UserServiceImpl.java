package com.zl.springboot.service.impl;

import com.zl.springboot.entity.User;
import com.zl.springboot.mapper.UserMapper;
import com.zl.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

    @Autowired
    public UserMapper userMapper;


    @Override
    public User findByPK(Integer id) {
        User u = userMapper.selectByPrimaryKey(id);
        return u;
    }
}

package com.zl.springboot.service;

import com.zl.springboot.entity.User;

public interface UserService {

    public User findByPK(Integer id);
}

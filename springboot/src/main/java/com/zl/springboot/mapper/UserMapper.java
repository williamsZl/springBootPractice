package com.zl.springboot.mapper;

import com.zl.springboot.entity.User;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {

    public User selectByPrimaryKey(Integer id);
}

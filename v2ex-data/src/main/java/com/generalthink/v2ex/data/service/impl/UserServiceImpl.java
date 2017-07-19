package com.generalthink.v2ex.data.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generalthink.v2ex.data.dao.UserMapper;
import com.generalthink.v2ex.data.entity.User;
import com.generalthink.v2ex.data.entity.UserExample;
import com.generalthink.v2ex.data.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    
    @Override
    public Optional<User> login(String name, String password) {
        UserExample example = new UserExample();
        example.createCriteria().andNameEqualTo(name).andPasswordEqualTo(password);
        List<User> userList = userMapper.selectByExample(example);
        if(userList.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(userList.get(0));
    }

    @Override
    public User signin(String name, String password, String email) {
        User user = User.builder().name(name).password(password).email(email).build();
        userMapper.insert(user);
        return user;
    }

}

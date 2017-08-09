package com.generalthink.v2ex.data.service.impl;

import java.util.List;
import java.util.Optional;

import org.apache.commons.collections4.CollectionUtils;
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
    public Optional<User> signin(String account, String password) {
        User userParameter = User.builder().name(account).email(account).password(password).build();
        User user = userMapper.getUserByNameOrEmail(userParameter);
       
        return Optional.ofNullable(user);
    }

    @Override
    public User signup(String name, String password, String email) {
        User user = User.builder().name(name).password(password).email(email).build();
        userMapper.insert(user);
        return user;
    }

    @Override
    public boolean existUserName(String name) {
        UserExample example = new UserExample();
        example.createCriteria().andNameEqualTo(name);
        List<User> userList = userMapper.selectByExample(example);
        if(CollectionUtils.isNotEmpty(userList)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean existEmail(String email) {
        UserExample example = new UserExample();
        example.createCriteria().andEmailEqualTo(email);
        List<User> userList = userMapper.selectByExample(example);
        if(CollectionUtils.isNotEmpty(userList)) {
            return true;
        }
        return false;
    }

}

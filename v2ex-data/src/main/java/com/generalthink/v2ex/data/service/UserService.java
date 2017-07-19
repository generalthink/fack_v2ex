package com.generalthink.v2ex.data.service;

import java.util.Optional;

import com.generalthink.v2ex.data.entity.User;

public interface UserService {

    public Optional<User> login(String name,String password);
    
    public User signin(String name,String password,String email);

}

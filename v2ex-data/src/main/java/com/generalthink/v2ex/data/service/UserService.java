package com.generalthink.v2ex.data.service;

import java.util.Optional;

import com.generalthink.v2ex.data.entity.User;

public interface UserService {

    public Optional<User> signin(String account,String password);
    
    public User signup(String name,String password,String email);
    
    public boolean existUserName(String name);
    
    public boolean existEmail(String email);

}

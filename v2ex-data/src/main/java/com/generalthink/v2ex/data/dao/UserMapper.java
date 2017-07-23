package com.generalthink.v2ex.data.dao;

import java.util.List;

import com.generalthink.v2ex.data.entity.User;
import com.generalthink.v2ex.data.entity.UserExample;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    User getUserByNameOrEmail(User record);
}
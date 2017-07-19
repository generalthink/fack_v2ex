package com.generalthink.v2ex.data.dao;

import com.generalthink.v2ex.data.entity.UserInfo;
import com.generalthink.v2ex.data.entity.UserInfoExample;
import java.util.List;

public interface UserInfoMapper {
    int countByExample(UserInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    List<UserInfo> selectByExample(UserInfoExample example);

    UserInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}
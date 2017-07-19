package com.generalthink.v2ex.data.dao;

import com.generalthink.v2ex.data.entity.UserFollow;
import com.generalthink.v2ex.data.entity.UserFollowExample;
import java.util.List;

public interface UserFollowMapper {
    int countByExample(UserFollowExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserFollow record);

    int insertSelective(UserFollow record);

    List<UserFollow> selectByExample(UserFollowExample example);

    UserFollow selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserFollow record);

    int updateByPrimaryKey(UserFollow record);
}
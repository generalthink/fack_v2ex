package com.generalthink.v2ex.data.dao;

import com.generalthink.v2ex.data.entity.UserWealth;
import com.generalthink.v2ex.data.entity.UserWealthExample;
import java.util.List;

public interface UserWealthMapper {
    int countByExample(UserWealthExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserWealth record);

    int insertSelective(UserWealth record);

    List<UserWealth> selectByExample(UserWealthExample example);

    UserWealth selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserWealth record);

    int updateByPrimaryKey(UserWealth record);
}
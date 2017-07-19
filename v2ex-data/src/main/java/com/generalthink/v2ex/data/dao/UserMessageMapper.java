package com.generalthink.v2ex.data.dao;

import com.generalthink.v2ex.data.entity.UserMessage;
import com.generalthink.v2ex.data.entity.UserMessageExample;
import java.util.List;

public interface UserMessageMapper {
    int countByExample(UserMessageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserMessage record);

    int insertSelective(UserMessage record);

    List<UserMessage> selectByExample(UserMessageExample example);

    UserMessage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserMessage record);

    int updateByPrimaryKey(UserMessage record);
}
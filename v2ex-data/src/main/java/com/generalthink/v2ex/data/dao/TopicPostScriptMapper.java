package com.generalthink.v2ex.data.dao;

import com.generalthink.v2ex.data.entity.TopicPostScript;
import com.generalthink.v2ex.data.entity.TopicPostScriptExample;
import java.util.List;

public interface TopicPostScriptMapper {
    int countByExample(TopicPostScriptExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TopicPostScript record);

    int insertSelective(TopicPostScript record);

    List<TopicPostScript> selectByExample(TopicPostScriptExample example);

    TopicPostScript selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TopicPostScript record);

    int updateByPrimaryKey(TopicPostScript record);
}
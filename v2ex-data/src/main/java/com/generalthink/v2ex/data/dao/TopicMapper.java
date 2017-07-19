package com.generalthink.v2ex.data.dao;

import com.generalthink.v2ex.data.entity.Topic;
import com.generalthink.v2ex.data.entity.TopicExample;
import java.util.List;

public interface TopicMapper {
    int countByExample(TopicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Topic record);

    int insertSelective(Topic record);

    List<Topic> selectByExample(TopicExample example);

    Topic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Topic record);

    int updateByPrimaryKey(Topic record);
}
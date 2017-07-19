package com.generalthink.v2ex.data.dao;

import com.generalthink.v2ex.data.entity.TopicContent;
import com.generalthink.v2ex.data.entity.TopicContentExample;
import java.util.List;

public interface TopicContentMapper {
    int countByExample(TopicContentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TopicContent record);

    int insertSelective(TopicContent record);

    List<TopicContent> selectByExample(TopicContentExample example);

    TopicContent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TopicContent record);

    int updateByPrimaryKey(TopicContent record);
}
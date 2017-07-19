package com.generalthink.v2ex.data.dao;

import com.generalthink.v2ex.data.entity.TopicReplyContent;
import com.generalthink.v2ex.data.entity.TopicReplyContentExample;
import java.util.List;

public interface TopicReplyContentMapper {
    int countByExample(TopicReplyContentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TopicReplyContent record);

    int insertSelective(TopicReplyContent record);

    List<TopicReplyContent> selectByExample(TopicReplyContentExample example);

    TopicReplyContent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TopicReplyContent record);

    int updateByPrimaryKey(TopicReplyContent record);
}
package com.generalthink.v2ex.data.dao;

import com.generalthink.v2ex.data.entity.TopicCollect;
import com.generalthink.v2ex.data.entity.TopicCollectExample;
import java.util.List;

public interface TopicCollectMapper {
    int countByExample(TopicCollectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TopicCollect record);

    int insertSelective(TopicCollect record);

    List<TopicCollect> selectByExample(TopicCollectExample example);

    TopicCollect selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TopicCollect record);

    int updateByPrimaryKey(TopicCollect record);
}
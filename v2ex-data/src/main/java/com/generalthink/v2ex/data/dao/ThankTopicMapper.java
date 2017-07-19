package com.generalthink.v2ex.data.dao;

import com.generalthink.v2ex.data.entity.ThankTopic;
import com.generalthink.v2ex.data.entity.ThankTopicExample;
import java.util.List;

public interface ThankTopicMapper {
    int countByExample(ThankTopicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ThankTopic record);

    int insertSelective(ThankTopic record);

    List<ThankTopic> selectByExample(ThankTopicExample example);

    ThankTopic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ThankTopic record);

    int updateByPrimaryKey(ThankTopic record);
}
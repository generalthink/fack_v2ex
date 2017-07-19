package com.generalthink.v2ex.data.dao;

import com.generalthink.v2ex.data.entity.ThankReply;
import com.generalthink.v2ex.data.entity.ThankReplyExample;
import java.util.List;

public interface ThankReplyMapper {
    int countByExample(ThankReplyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ThankReply record);

    int insertSelective(ThankReply record);

    List<ThankReply> selectByExample(ThankReplyExample example);

    ThankReply selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ThankReply record);

    int updateByPrimaryKey(ThankReply record);
}
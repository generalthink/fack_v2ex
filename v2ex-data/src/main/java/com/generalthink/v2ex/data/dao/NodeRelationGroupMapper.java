package com.generalthink.v2ex.data.dao;

import com.generalthink.v2ex.data.entity.NodeRelationGroup;
import com.generalthink.v2ex.data.entity.NodeRelationGroupExample;
import java.util.List;

public interface NodeRelationGroupMapper {
    int countByExample(NodeRelationGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NodeRelationGroup record);

    int insertSelective(NodeRelationGroup record);

    List<NodeRelationGroup> selectByExample(NodeRelationGroupExample example);

    NodeRelationGroup selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NodeRelationGroup record);

    int updateByPrimaryKey(NodeRelationGroup record);
}
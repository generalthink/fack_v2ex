package com.generalthink.v2ex.data.dao;

import com.generalthink.v2ex.data.entity.NodeGroup;
import com.generalthink.v2ex.data.entity.NodeGroupExample;
import java.util.List;

public interface NodeGroupMapper {
    int countByExample(NodeGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NodeGroup record);

    int insertSelective(NodeGroup record);

    List<NodeGroup> selectByExample(NodeGroupExample example);

    NodeGroup selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NodeGroup record);

    int updateByPrimaryKey(NodeGroup record);
}
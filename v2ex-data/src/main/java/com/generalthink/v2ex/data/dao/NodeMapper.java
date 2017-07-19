package com.generalthink.v2ex.data.dao;

import com.generalthink.v2ex.data.entity.Node;
import com.generalthink.v2ex.data.entity.NodeExample;
import java.util.List;

public interface NodeMapper {
    int countByExample(NodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Node record);

    int insertSelective(Node record);

    List<Node> selectByExample(NodeExample example);

    Node selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Node record);

    int updateByPrimaryKey(Node record);
}
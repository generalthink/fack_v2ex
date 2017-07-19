package com.generalthink.v2ex.data.dao;

import com.generalthink.v2ex.data.entity.NodeCategory;
import com.generalthink.v2ex.data.entity.NodeCategoryExample;
import java.util.List;

public interface NodeCategoryMapper {
    int countByExample(NodeCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NodeCategory record);

    int insertSelective(NodeCategory record);

    List<NodeCategory> selectByExample(NodeCategoryExample example);

    NodeCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NodeCategory record);

    int updateByPrimaryKey(NodeCategory record);
}
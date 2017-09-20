package com.generalthink.v2ex.data.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generalthink.v2ex.data.dao.NodeCategoryMapper;
import com.generalthink.v2ex.data.entity.NodeCategory;
import com.generalthink.v2ex.data.service.NodeCategoryService;

@Service("nodeCategoryService")
public class NodeCategoryServiceImpl implements NodeCategoryService {

    @Autowired
    private NodeCategoryMapper nodeCategoryMapper;
    
    @Override
    public Integer insert(NodeCategory nodeCategory) {
        return nodeCategoryMapper.insert(nodeCategory);
    }

    @Override
    public Integer deleteById(Integer id) {
        return nodeCategoryMapper.deleteByPrimaryKey(id);
    }

}

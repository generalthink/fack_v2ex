package com.generalthink.v2ex.data.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generalthink.v2ex.data.dao.NodeGroupMapper;
import com.generalthink.v2ex.data.entity.NodeGroup;
import com.generalthink.v2ex.data.service.NodeGroupService;

@Service("nodeGroupService")
public class NodeGroupServiceImpl implements NodeGroupService {

    @Autowired
    private NodeGroupMapper nodeGroupMapper;
    
    @Override
    public Integer insert(NodeGroup node) {
        return nodeGroupMapper.insert(node);
    }


    @Override
    public void deleteById(Integer id) {
        nodeGroupMapper.deleteByPrimaryKey(id);
    }

}

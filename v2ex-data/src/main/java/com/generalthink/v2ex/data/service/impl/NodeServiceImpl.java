package com.generalthink.v2ex.data.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generalthink.v2ex.data.dao.NodeMapper;
import com.generalthink.v2ex.data.entity.Node;
import com.generalthink.v2ex.data.service.NodeService;

@Service("nodeService")
public class NodeServiceImpl implements NodeService {

    @Autowired
    private NodeMapper nodeMapper;
    
    @Override
    public Integer insert(Node node) {
        
        return nodeMapper.insertSelective(node);
    }

    @Override
    public void updateById(Node node) {
       nodeMapper.updateByPrimaryKeySelective(node);
    }

    @Override
    public void deleteById(Integer id) {
        nodeMapper.deleteByPrimaryKey(id);
    }

}

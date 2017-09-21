package com.generalthink.v2ex.data.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generalthink.v2ex.data.dao.NodeCategoryMapper;
import com.generalthink.v2ex.data.dao.NodeGroupMapper;
import com.generalthink.v2ex.data.dao.NodeMapper;
import com.generalthink.v2ex.data.dao.NodeRelationGroupMapper;
import com.generalthink.v2ex.data.entity.Node;
import com.generalthink.v2ex.data.entity.NodeCategory;
import com.generalthink.v2ex.data.entity.NodeGroup;
import com.generalthink.v2ex.data.entity.NodeRelationGroup;
import com.generalthink.v2ex.data.service.NodeManageService;

@Service("nodeManageService")
public class NodeManageServiceImpl implements NodeManageService {

    @Autowired
    private NodeCategoryMapper nodeCategoryMapper;
    
    @Autowired
    private NodeMapper nodeMapper;
    
    @Autowired
    private NodeGroupMapper nodeGroupMapper;
    
    @Autowired
    private NodeRelationGroupMapper nodeRelationGroupMapper;
    
    @Override
    public Integer insertNodeCategory(NodeCategory nodeCategory) {
        
        return null;
    }

    @Override
    public Integer deleteNodeCategoryById(Integer id) {
        return nodeCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer insertNodeGroup(NodeGroup nodeGroup) {

        return nodeGroupMapper.insert(nodeGroup);
    }

    @Override
    public void deleteNodeGroupById(Integer id) {

        nodeGroupMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer insertNode(Node node) {
        return nodeMapper.insert(node);
    }

    @Override
    public void updateNodeById(Node node) {

        nodeMapper.updateByPrimaryKeySelective(node);
    }

    @Override
    public void deleteNodeById(Integer id) {

        nodeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void insertNodeRelationGroup(NodeRelationGroup nrg) {

        nodeRelationGroupMapper.insert(nrg);
    }

    @Override
    public void updateNodeRelationGroup(NodeRelationGroup nrg) {

        nodeRelationGroupMapper.updateByPrimaryKey(nrg);
    }

    @Override
    public void deleteNodeRelationGroupById(Integer id) {
        nodeRelationGroupMapper.deleteByPrimaryKey(id);
    }

}

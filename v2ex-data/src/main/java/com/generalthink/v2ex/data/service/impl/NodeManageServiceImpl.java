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

@Service
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
    public Integer insertNodeCategory(String nodeCategoryName) {
        NodeCategory category = NodeCategory.builder().name(nodeCategoryName).build();
        return nodeCategoryMapper.insert(category);
    }

    @Override
    public Integer deleteNodeCategoryById(Integer id) {
        return nodeCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer insertNodeGroup(String nodeGroupName) {
        NodeGroup group = NodeGroup.builder().name(nodeGroupName).build();
        return nodeGroupMapper.insert(group);
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

    @Override
    public Boolean existNodeCategory(Integer nodeCategoryId) {
        
        return nodeCategoryMapper.selectByPrimaryKey(nodeCategoryId) != null;
    }

    @Override
    public Boolean existNodeGroup(Integer nodeGroupId) {
        return nodeGroupMapper.selectByPrimaryKey(nodeGroupId) != null;
    }

}

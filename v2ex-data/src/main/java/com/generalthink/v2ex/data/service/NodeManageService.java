package com.generalthink.v2ex.data.service;

import com.generalthink.v2ex.data.entity.Node;
import com.generalthink.v2ex.data.entity.NodeRelationGroup;

public interface NodeManageService {

    Integer insertNodeCategory(String nodeCategoryName);
    
    Integer deleteNodeCategoryById(Integer id);
    
    Integer insertNodeGroup(String nodeGroupName);
    
    void deleteNodeGroupById(Integer id);
    
    Integer insertNode(Node node);
    
    void updateNodeById(Node node);
    
    void deleteNodeById(Integer id);
    
    void insertNodeRelationGroup(NodeRelationGroup nrg);
    
    void updateNodeRelationGroup(NodeRelationGroup nrg);
    
    void deleteNodeRelationGroupById(Integer id);
    
    Boolean existNodeCategory(Integer nodeCategoryId);
    
    Boolean existNodeGroup(Integer nodeGroupId);
    
}

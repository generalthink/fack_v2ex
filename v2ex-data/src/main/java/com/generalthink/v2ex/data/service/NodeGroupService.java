package com.generalthink.v2ex.data.service;

import com.generalthink.v2ex.data.entity.NodeGroup;

/**
 * Node group只用于首页节点显示，并不作为node的必须属性
 * @author TKing
 *
 */
public interface NodeGroupService {

    Integer insert(NodeGroup node);
    
    void deleteById(Integer id);
    
}

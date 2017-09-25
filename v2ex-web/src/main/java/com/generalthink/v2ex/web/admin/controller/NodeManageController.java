package com.generalthink.v2ex.web.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.generalthink.v2ex.data.entity.Node;
import com.generalthink.v2ex.data.service.NodeManageService;

/**
 * 管理员节点管理功能
 * 1. 节点新增、修改、删除、移动
 * @author TKing
 *
 */
@Controller
@RequestMapping("/admin/nodeManage")
public class NodeManageController {

    @Autowired
    private NodeManageService nodeManageService;
    
    @PostMapping("/node")
    public void addNode(@RequestParam(name="name",required = true)String name,
                        @RequestParam(name="aliased",required = true)String aliases,
                        @RequestParam(name="nodeCategoryId",required = true)Integer nodeCategoryId) {
        if(!nodeManageService.existNodeCategory(nodeCategoryId)) {
            throw new RuntimeException("node category不存在");
        }
        Node node = Node.builder().name(name).aliases(aliases).nodeCategoryId(nodeCategoryId).build();
        nodeManageService.insertNode(node);
        
    }
    
    @PostMapping("/category")
    public void addCategory(@RequestParam(name="name",required = true) String name) {
        nodeManageService.insertNodeCategory(name);
    }
    
    @PostMapping("/group")
    public void addGroup(@RequestParam(name="name",required=true) String name) {
        nodeManageService.insertNodeGroup(name);
    }

}

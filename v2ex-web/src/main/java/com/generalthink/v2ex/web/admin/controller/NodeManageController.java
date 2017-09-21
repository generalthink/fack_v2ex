package com.generalthink.v2ex.web.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
    private NodeManageService nodeService;
    
    @PostMapping("/")
    public void addNode() {
        
    }

    
}

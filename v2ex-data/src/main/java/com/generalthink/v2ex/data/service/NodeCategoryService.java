package com.generalthink.v2ex.data.service;

import com.generalthink.v2ex.data.entity.NodeCategory;

public interface NodeCategoryService {
    
    Integer insert(NodeCategory nodeCategory);
    
    Integer deleteById(Integer id);
}

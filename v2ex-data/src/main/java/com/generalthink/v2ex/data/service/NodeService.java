package com.generalthink.v2ex.data.service;

import com.generalthink.v2ex.data.entity.Node;

public interface NodeService {

    Integer insert(Node node);
    
    void updateById(Node node);
    
    void deleteById(Integer id);
    
   

}

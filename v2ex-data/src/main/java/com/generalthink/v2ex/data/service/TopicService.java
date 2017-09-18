package com.generalthink.v2ex.data.service;

import com.generalthink.v2ex.data.vo.topic.TopicPage;



public interface TopicService {

    public Integer insertTopic(String title,String content,Integer nodeId);
    
    public void updateTopic(Integer topicId,String title,String content,Integer nodeId);
    
    public void insertPostScript(Integer topicId,String postScript);
    
    public Boolean existTopic(Integer topicId);
    
    public TopicPage getTopic(Integer topicId,Integer pageNum);

}

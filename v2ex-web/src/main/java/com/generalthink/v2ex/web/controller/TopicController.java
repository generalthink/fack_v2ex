package com.generalthink.v2ex.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.generalthink.v2ex.data.service.TopicService;

@Controller
@RequestMapping("/topic")
public class TopicController {

    @Autowired
    private TopicService topicService;
    
    @GetMapping("/new")
    public String newTopic() {
        return "new_topic";
    }

    /**
     * 新增主题
     * @param title
     * @param content
     * @param nodeId
     * @return
     */
    @PostMapping("/new")
    public String newTopic(@RequestParam(required = true, name = "title") String title,
            String content, @RequestParam(required = true) Integer nodeId) {

        Integer topicId = topicService.insertTopic(title, content, nodeId);
        
        return "redirect:/topic/" + topicId;
    }

    @RequestMapping("/{topicId}")
    public String showTopic(@PathVariable Integer topicId) {
        //验证topic是否存在
        Boolean  existTopic = topicService.existTopic(topicId);
        if(!existTopic) {
            throw new RuntimeException("你所访问的主题不存在");
        }
        
        
        
        return "";
    }
    
    
    
}

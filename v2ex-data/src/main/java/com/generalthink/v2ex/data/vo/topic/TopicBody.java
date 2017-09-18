package com.generalthink.v2ex.data.vo.topic;

import java.util.Date;
import java.util.List;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.generalthink.v2ex.data.entity.User;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access=AccessLevel.PRIVATE)
public class TopicBody {

    private Integer topicId;
    
    private String content;
    
    private String title;
    
    private List<String> postScriptList;
    
    private User user;
    
    private Integer clickCount;
    
    private Date updateDate;
    
}

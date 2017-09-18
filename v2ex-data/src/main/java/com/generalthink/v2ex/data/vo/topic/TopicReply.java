package com.generalthink.v2ex.data.vo.topic;


import java.util.Date;

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
public class TopicReply {

    private User replyUser;
    
    private Integer topicId;
    
    private Date replyTime;
    
    private String replyContent;

}

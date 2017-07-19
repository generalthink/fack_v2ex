package com.generalthink.v2ex.data.entity;

import java.util.Date;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access=AccessLevel.PRIVATE)
public class TopicReplyContent {
    private Integer id;

    private Integer topicId;

    private String replyContent;

    private Date replayTime;

    private Integer replayUserId;
}
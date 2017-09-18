package com.generalthink.v2ex.data.vo.topic;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.github.pagehelper.PageInfo;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access=AccessLevel.PRIVATE)
public class TopicPage {

   private TopicBody topicBody;
   
   private PageInfo<TopicReply> topicPageInfo;

}

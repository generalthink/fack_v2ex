package com.generalthink.v2ex.data.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.collections4.CollectionUtils;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generalthink.v2ex.data.dao.TopicContentMapper;
import com.generalthink.v2ex.data.dao.TopicMapper;
import com.generalthink.v2ex.data.dao.TopicPostScriptMapper;
import com.generalthink.v2ex.data.dao.TopicReplyContentMapper;
import com.generalthink.v2ex.data.entity.Topic;
import com.generalthink.v2ex.data.entity.TopicContent;
import com.generalthink.v2ex.data.entity.TopicContentExample;
import com.generalthink.v2ex.data.entity.TopicPostScript;
import com.generalthink.v2ex.data.entity.TopicPostScriptExample;
import com.generalthink.v2ex.data.entity.TopicReplyContentExample;
import com.generalthink.v2ex.data.service.TopicService;
import com.generalthink.v2ex.data.utils.DozerMapperUtil;
import com.generalthink.v2ex.data.vo.topic.TopicBody;
import com.generalthink.v2ex.data.vo.topic.TopicPage;
import com.generalthink.v2ex.data.vo.topic.TopicReply;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("topicService")
public class TopicServiceImpl implements TopicService {

    @Autowired
    private TopicMapper topicMapper;

    @Autowired
    private TopicContentMapper topicContentMapper;

    @Autowired
    private TopicPostScriptMapper topicPostScriptMapper;

    @Autowired
    private TopicReplyContentMapper topicReplyContentMapper;

    @Override
    public Integer insertTopic(String title, String content, Integer nodeId) {
        Topic topic = Topic.builder().title(title).nodeId(nodeId).build();
        topicMapper.insertSelective(topic);

        Integer topicId = topic.getId();

        TopicContent topicContent =
                TopicContent.builder().content(content).topicId(topicId).build();
        topicContentMapper.insertSelective(topicContent);

        return topicId;
    }

    @Override
    public void updateTopic(Integer topicId, String title, String content, Integer nodeId) {
        Topic topic = Topic.builder().title(title).nodeId(nodeId).id(topicId).build();
        topicMapper.updateByPrimaryKeySelective(topic);

        TopicContent topicContent =
                TopicContent.builder().content(content).topicId(topicId).build();
        topicContentMapper.updateByPrimaryKeySelective(topicContent);
    }

    @Override
    public void insertPostScript(Integer topicId, String postScript) {
        TopicPostScript topicPostScript =
                TopicPostScript.builder().topicId(topicId).postScript(postScript).build();
        topicPostScriptMapper.insert(topicPostScript);
    }

    @Override
    public Boolean existTopic(Integer topicId) {
        Topic topic = topicMapper.selectByPrimaryKey(topicId);
        if (null == topic) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    @Override
    public TopicPage getTopic(Integer topicId, Integer pageNum) {

        Mapper mapper = DozerMapperUtil.instance();

        Topic topic = topicMapper.selectByPrimaryKey(topicId);
        TopicBody topicBody = mapper.map(topic, TopicBody.class);

        TopicContentExample contentExample = new TopicContentExample();
        contentExample.createCriteria().andTopicIdEqualTo(topicId);

        List<TopicContent> topicContentList = topicContentMapper.selectByExample(contentExample);
        if (!topicContentList.isEmpty()) {
            mapper.map(topicContentList.get(0), topicBody);
        }

        TopicPostScriptExample tpsExample = new TopicPostScriptExample();
        tpsExample.createCriteria().andTopicIdEqualTo(topicId);
        List<TopicPostScript> postScriptList = topicPostScriptMapper.selectByExample(tpsExample);
        if (CollectionUtils.isNotEmpty(postScriptList)) {
            List<String> postScriptStr = postScriptList.stream().map((postScript) -> {
                return postScript.getPostScript();
            }).collect(Collectors.toList());
            topicBody.setPostScriptList(postScriptStr);
        }

        // 获取topicPager
        TopicReplyContentExample tpcExample = new TopicReplyContentExample();
        tpcExample.createCriteria().andTopicIdEqualTo(topicId);
        //每页显示10条
      /* PageInfo<TopicReply> topicReplyContentPage =   PageHelper.startPage(pageNum, 10).doSelectPageInfo(
           ()-> {
               topicReplyContentMapper.selectByExample(tpcExample).stream().map((replyContent) -> {
                   return mapper.map(replyContent, TopicReply.class);
               }).collect(Collectors.toList());
           }
           );*/
        
       PageInfo<TopicReply> pageInfo = PageHelper.startPage(pageNum,10).doSelectPageInfo(()-> {
           topicReplyContentMapper.selectByExample(tpcExample).stream()
           .map((replyContent)-> {
               return mapper.map(replyContent, TopicReply.class); 
           }).collect(Collectors.toList());
        });
        

        TopicPage topicPageContent =
                TopicPage.builder().topicBody(topicBody).topicPageInfo(pageInfo).build();

        return topicPageContent;
    }
}

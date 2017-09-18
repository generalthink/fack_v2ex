package com.generalthink.v2ex.data.utils;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapperSingletonWrapper;
import org.dozer.Mapper;

import com.generalthink.v2ex.data.entity.TopicReplyContent;

public final class DozerMapperUtil {

    private DozerMapperUtil() {

    }

    private static Mapper dozerMapper = DozerBeanMapperSingletonWrapper.getInstance();

    public static Mapper instance() {
        return dozerMapper;
    }
    
    public static void main(String[] args) {
        TopicReplyContent content = TopicReplyContent.builder().replyContent("heheda").build();
        List<TopicReplyContent> list = new ArrayList<TopicReplyContent>();
        list.add(content);
    }

}

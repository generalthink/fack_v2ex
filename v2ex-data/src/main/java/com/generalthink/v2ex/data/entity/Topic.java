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
public class Topic {
    private Integer id;

    private Integer nodeId;

    private Integer userId;

    private String title;

    private Integer clickCount;

    private Date createTime;

    private Date updateTime;
}
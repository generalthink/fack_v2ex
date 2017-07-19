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
public class Node {
    private Integer id;

    private String name;

    private String aliases;

    private Integer nodeGroupId;

    private Integer nodeCategoryId;

    private Date createTime;
}
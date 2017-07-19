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
public class UserInfo {
    private Integer id;

    private Integer userId;

    private Byte blocked;

    private String userImgPath;

    private String personalWebsite;

    private String location;

    private String signature;

    private String introduction;

    private String workPosition;

    private String company;

    private Date lastLoginTime;

    private Integer continuationDay;

    private Long loginIp;

    private Date createTime;

    private Date updateTime;
}
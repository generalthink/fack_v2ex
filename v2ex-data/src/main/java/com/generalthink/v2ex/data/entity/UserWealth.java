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
public class UserWealth {
    private Integer id;

    private Integer userId;

    private String description;

    private Date updateTime;

    private String type;

    private Double amount;

    private Double balance;
}
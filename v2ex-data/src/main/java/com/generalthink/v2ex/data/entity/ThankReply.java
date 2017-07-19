package com.generalthink.v2ex.data.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access=AccessLevel.PRIVATE)
public class ThankReply {
    private Integer id;

    private Integer thankUserId;

    private Integer thankReplyId;
}
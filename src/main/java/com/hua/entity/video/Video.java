package com.hua.entity.video;

import com.hua.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Video extends BaseEntity {

    private static final long serialVersionUID = 1L;

    //YV ID 以YV+UUID;
    private String yv;

    private Long url;

    private Long userId;

    private Long cover;

    /**
     * 公开/私密 0:公开 1:私密 默认为0
     */
    private Boolean open;

    //审核状态 通过 未通过 审核中
    private Integer auditStatus;

    //审核状态的消息
    private String msg;


}

package com.hua.entity.video;

import com.hua.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class VideoType  extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Long videoId;

    private Long typeId;
}

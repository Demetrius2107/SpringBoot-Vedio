package com.hua.entity.user;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.hua.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;

@Data
@EqualsAndHashCode(callSuper = false)
public class Favorites  extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type  = IdType.AUTO)
    private Long id;

    @NotBlank(message = "收藏夹取名")
    private String name;

    private String description;

    private Long userId;

    //收藏夹下的视频总数
    @TableField(exist = false)
    private Long videoCount;

}

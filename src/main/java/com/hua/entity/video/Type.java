package com.hua.entity.video;

import com.baomidou.mybatisplus.annotation.TableField;
import com.hua.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import java.util.Arrays;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
public class Type extends BaseEntity {

    private static final long servialVersionUID = 1L;

    @NotBlank(message = "分类名称不可为空")
    private String name;

    private String description;

    private String icon;

    private Boolean open;

    private String labelName;

    private Integer sort;

    @TableField(exist = false)
    private Boolean used;

    public List<String> buildLabel(){
        return Arrays.asList(labelName.split(","));
    }




}

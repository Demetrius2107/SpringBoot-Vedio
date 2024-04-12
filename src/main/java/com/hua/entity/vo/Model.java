package com.hua.entity.vo;

import lombok.Data;
import org.hibernate.validator.internal.util.StringHelper;

@Data
public class Model {
    private String label;
    private Long videoId;

    private Double score;

}

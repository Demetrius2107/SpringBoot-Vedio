package com.hua.entity.user;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
public class UserSubscribe implements Serializable {
    private Long id;
    private Long typeId;
    private Long userId;
}

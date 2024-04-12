package com.hua.entity.user;

import com.hua.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@EqualsAndHashCode(callSuper = false)
public class User extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String nickName;

    @Email
    private String email;

    @NotBlank(message = "密码不能为空")
    private String password;

    private String description;

    private Boolean sex;
}

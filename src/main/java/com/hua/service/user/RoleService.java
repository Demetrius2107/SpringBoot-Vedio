package com.hua.service.user;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hua.entity.user.Role;
import com.hua.entity.user.Tree;
import com.hua.util.R;
import com.hua.entity.vo.AssignRoleVo;
import com.hua.entity.vo.AuthorityVo;

import java.util.List;

public interface RoleService extends IService<Role> {

    List<Tree> tree();

    R removeRole(String id);

    R gavePermission(AuthorityVo authorityVO);

    R gaveRole(AssignRoleVo assignRoleVO);
}

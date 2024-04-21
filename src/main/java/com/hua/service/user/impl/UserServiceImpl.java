package com.hua.service.user.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hua.entity.user.User;
import com.hua.entity.video.Type;
import com.hua.entity.vo.*;
import com.hua.mapper.user.UserMapper;
import com.hua.service.FileService;
import com.hua.service.InterestPushService;
import com.hua.service.user.FavoritesService;
import com.hua.service.user.FollowService;
import com.hua.service.user.UserService;
import com.hua.service.user.UserSubscribeService;
import com.hua.util.RedisCacheUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl  extends ServiceImpl<UserMapper, User>  implements UserService {

    @Autowired
    private TypeService typeService;

    @Autowired
    private UserSubscribeService userSubscribeService;

    @Autowired
    private FollowService followService;

    @Autowired
    private RedisCacheUtil redisCacheUtil;

    @Autowired
    private FileService fileService;

    @Autowired
    private InterestPushService interestPushService;

    @Autowired
    private FavoritesService favoritesService;

    @Autowired
    private TextAuditService textAuditService;

    @Autowired
    private ImageAuditService imageAuditService;

    @Override
    public boolean register(RegisterVO registerVO) throws Exception {
        return false;
    }

    @Override
    public UserVO getInfo(Long userId) {
        return null;
    }

    @Override
    public Page<User> getFollows(Long userId, BasePage basePage) {
        return null;
    }

    @Override
    public Page<User> getFans(Long userId, BasePage basePage) {
        return null;
    }

    @Override
    public List<User> list(Collection<Long> userIds) {
        return null;
    }

    @Override
    public void subscribe(Set<Long> typeIds) {

    }

    @Override
    public Collection<Type> listSubscribeType(Long userId) {
        return null;
    }

    @Override
    public boolean follows(Long followsUserId) {
        return false;
    }

    @Override
    public void updateUserModel(UserModel userModel) {

    }

    @Override
    public Boolean findPassword(FindPWVO findPWVO) {
        return null;
    }

    @Override
    public void updateUser(UpdateUserVO user) {

    }

    @Override
    public Collection<String> searchHistory(Long userId) {
        return null;
    }

    @Override
    public void addSearchHistory(Long userId, String search) {

    }

    @Override
    public void deleteSearchHistory(Long userId) {

    }

    @Override
    public Collection<Type> listNoSubscribeType(Long aLong) {
        return null;
    }
}

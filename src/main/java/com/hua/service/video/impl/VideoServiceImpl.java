package com.hua.service.video.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hua.entity.video.Video;
import com.hua.entity.video.VideoShare;
import com.hua.entity.vo.BasePage;
import com.hua.entity.vo.HotVideo;
import com.hua.exception.BaseException;
import com.hua.mapper.video.VideoMapper;
import com.hua.service.FeedService;
import com.hua.service.FileService;
import com.hua.service.InterestPushService;
import com.hua.service.audit.VideoPublishAuditServiceImpl;
import com.hua.service.user.FavoritesService;
import com.hua.service.user.FollowService;
import com.hua.service.user.UserService;
import com.hua.service.video.TypeService;
import com.hua.service.video.VideoService;
import com.hua.service.video.VideoShareService;
import com.hua.service.video.VideoStarService;
import com.hua.util.RedisCacheUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

@Service
public class VideoServiceImpl extends ServiceImpl<VideoMapper,Video> implements VideoService {

    @Autowired
    private TypeService typeService;

    @Autowired
    private InterestPushService interestPushService;

    @Autowired
    private UserService userService;

    @Autowired
    private VideoStarService videoStarService;

    @Autowired
    private VideoShareService videoShareService;

    @Autowired
    private RedisCacheUtil redisCacheUtil;

    @Autowired
    private FavoritesService favoritesService;

    @Autowired
    private VideoMapper videoMapper;

    @Autowired
    private VideoPublishAuditServiceImpl videoPublishAuditService;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private FollowService followService;

    @Autowired
    private FeedService feedService;

    @Autowired
    private FileService fileService;

    final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public Video getVideoById(Long id, Long userId) {
        final Video video = this.getOne(new LambdaQueryWrapper<Video>().eq(Video::getId,videoId));
        if(video == null) throw new BaseException("指定视频不存在");

        //私密则返回空
        if(video.getOpen()) return new Video();
        return null;
    }

    @Override
    public void publishVideo(Video video) {

    }

    @Override
    public void deleteVideo(Long id) {

    }

    @Override
    public Collection<Video> pushVideos(Long userId) {
        return null;
    }

    @Override
    public Collection<Video> getVideoByTypeId(Long typeId) {
        return null;
    }

    @Override
    public IPage<Video> searchVideo(String search, BasePage basePage, Long userId) {
        return null;
    }

    @Override
    public void auditProcess(Video video) {

    }

    @Override
    public boolean startVideo(Long videoId) {
        return false;
    }

    @Override
    public boolean shareVideo(VideoShare videoShare) {
        return false;
    }

    @Override
    public void historyVideo(Long videoId, Long userId) throws Exception {

    }

    @Override
    public boolean favoritesVideo(Long fId, Long vId) {
        return false;
    }

    @Override
    public LinkedHashMap<String, List<Video>> getHistory(BasePage basePage) {
        return null;
    }

    @Override
    public Collection<Video> listVideoByFavorites(Long favoritesId) {
        return null;
    }

    @Override
    public Collection<HotVideo> hotRank() {
        return null;
    }

    @Override
    public Collection<Video> listSimilarVideo(Video video) {
        return null;
    }

    @Override
    public IPage<Video> listByUserIdOpenVideo(Long userId, BasePage basePage) {
        return null;
    }

    @Override
    public String getAuditQueueState() {
        return null;
    }

    @Override
    public List<Video> selectNDaysAgeVideo(long id, int days, int limit) {
        return null;
    }

    @Override
    public Collection<Video> listHotVideo() {
        return null;
    }

    @Override
    public Collection<Video> followFeed(Long userId, Long lastTime) {
        return null;
    }

    @Override
    public void initFollowFeed(Long userId) {

    }

    @Override
    public IPage<Video> listByUserIdVideo(BasePage basePage, Long userId) {
        return null;
    }

    @Override
    public Collection<Long> listVideoIdByUserId(Long userId) {
        return null;
    }

    @Override
    public void violations(Long id) {

    }
}

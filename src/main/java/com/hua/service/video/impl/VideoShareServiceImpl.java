package com.hua.service.video.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hua.entity.video.VideoShare;
import com.hua.mapper.video.VideoShareMapper;
import com.hua.service.video.VideoShareService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VideoShareServiceImpl extends ServiceImpl<VideoShareMapper, VideoShare> implements VideoShareService {
    @Override
    public boolean share(VideoShare videoShare) {

        try{
            //利用videoId和ip作为唯一索引，少一次查询
            //存在问题 事务自身调用 Spring不会拦截
            this.save(videoShare);
        }catch (Exception e){
            //不删除
            return false;
        }
        return true;
    }

    @Override
    public List<Long> getShareUserId(Long videoId) {
        //MP获取VideoShare对象列表 根据 videoId查询 调用Stream map 过滤 最后转list
        return this.list(new LambdaQueryWrapper<VideoShare>().eq(VideoShare::getVideoId,videoId)).stream().map(VideoShare::getUserId).collect(Collectors.toList());
    }
}

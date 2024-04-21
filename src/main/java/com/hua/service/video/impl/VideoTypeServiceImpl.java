package com.hua.service.video.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hua.entity.video.VideoType;
import com.hua.mapper.video.VideoTypeMapper;
import com.hua.service.video.VideoTypeService;
import org.springframework.stereotype.Service;

@Service
public class VideoTypeServiceImpl extends ServiceImpl<VideoTypeMapper, VideoType> implements VideoTypeService {
}

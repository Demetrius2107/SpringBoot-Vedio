package com.hua.service.audit;

import com.hua.entity.task.VideoTask;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Service;

@Service
public class VideoPublishAuditServiceImpl implements AuditService<VideoTask,VideoTask>, InitializingBean , BeanPostProcessor {
    @Override
    public VideoTask audit(VideoTask task) {
        return null;
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}

package com.hua.service.video;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hua.entity.video.Type;

import java.util.List;

public interface TypeService extends IService<Type> {

    /**
     * 获取分类下的标签
     * @param typeId
     * @return
     */
    List<String> getLabels(Long typeId);


    /**
     * 随机获取标签
     * @return
     */
    List<String> random10Labels();

}

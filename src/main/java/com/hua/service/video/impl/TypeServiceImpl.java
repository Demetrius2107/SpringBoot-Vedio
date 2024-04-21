package com.hua.service.video.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hua.entity.video.Type;
import com.hua.mapper.video.TypeMapper;
import com.hua.service.video.TypeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type> implements TypeService {
    @Override
    public List<String> getLabels(Long typeId) {
        return this.getById(typeId).buildLabel();
    }

    @Override
    public List<String> random10Labels() {
        //查询所有符合条件的值,因为是null 所以所有值
        final List<Type> types = list(null);
        //打乱集合元素
        Collections.shuffle(types);
        final ArrayList<String> labels = new ArrayList<>();
        for(Type type: types){
            for(String label : type.buildLabel()){
                if(labels.size() == 10){
                    return labels;
                }
                labels.add(label);
            }
        }
        return labels;
    }
}

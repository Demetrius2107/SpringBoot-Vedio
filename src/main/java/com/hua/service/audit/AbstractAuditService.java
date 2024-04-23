package com.hua.service.audit;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hua.config.QiNiuConfig;
import com.hua.entity.response.AuditResponse;
import com.hua.service.SettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public  abstract class AbstractAuditService<T,R> implements  AuditService<T,R>{

    @Autowired
    protected QiNiuConfig qiNiuConfig;

    @Autowired
    protected SettingService settingService;


    protected ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY,false);

    static final String contentType = "application/json";


    protected AuditResponse audit(List<ScoreJson> scoreJsonList,BodyJson bodyJson){

    }

}

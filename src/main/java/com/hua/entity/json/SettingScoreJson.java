package com.hua.entity.json;

import lombok.Data;

@Data
public class SettingScoreJson {

    //通过
    ScoreJson successJson;

    //人工审核
    ScoreJson manualScore;

    //PASS
    ScoreJson passScore;

}

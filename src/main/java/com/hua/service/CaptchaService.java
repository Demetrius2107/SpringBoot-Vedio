package com.hua.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hua.entity.Captcha;

import java.awt.image.BufferedImage;

/**
 * 系统验证码 服务类
 */
public interface CaptchaService extends IService<Captcha> {

    BufferedImage getCaptcha(String uuId);

    boolean validate(Captcha captcha) throws Exception;
}

package com.hua.service.impl;

import com.hua.entity.Captcha;
import com.hua.entity.user.User;
import com.hua.entity.vo.FindPWVO;
import com.hua.entity.vo.RegisterVO;
import com.hua.service.LoginService;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Service
public class LoginServiceImpl  implements LoginService {


    private UserService


    @Override
    public User login(User user) {
        return null;
    }

    @Override
    public Boolean checkCode(String email, Integer code) {
        return null;
    }

    @Override
    public void captcha(String uuid, HttpServletResponse response) throws IOException {

    }

    @Override
    public Boolean getCode(Captcha captcha) throws Exception {
        return null;
    }

    @Override
    public Boolean register(RegisterVO registerVO) throws Exception {
        return null;
    }

    @Override
    public Boolean findPassword(FindPWVO findPWVO) {
        return null;
    }
}

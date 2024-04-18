package com.hua.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hua.entity.user.User;
import com.hua.holder.UserHolder;
import com.hua.service.user.UserService;
import com.hua.util.JwtUtils;
import com.hua.util.R;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class AdminInterceptor implements HandlerInterceptor {

    private ObjectMapper objectMapper = new ObjectMapper();

    private UserService userService;

    public AdminInterceptor(UserService userService){
        this.userService = userService;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(request.getMethod().equals("OPTIONS")){
            return true;
        }

        if(!JwtUtils.checkToken(request)){
            response(R.error().message("请登录后再操作"),response);
            return false;
        }

        final Long userId = JwtUtils.getUserId(request);
        final User user = userService.getById(userId);
        if(ObjectUtils.isEmpty(user)){
            response(R.error().message("用户不存在"),response);
            return false;
        }
        UserHolder.set(userId);
        return true;
    }



}

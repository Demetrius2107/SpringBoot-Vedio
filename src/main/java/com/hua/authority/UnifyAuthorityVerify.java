package com.hua.authority;

import com.hua.util.JwtUtils;

import javax.servlet.http.HttpServletRequest;

public class UnifyAuthorityVerify  extends  DefaultAuthorityVerify{

    @Override
    public Boolean authorityVerify(HttpServletRequest request, String... permissions) {

        Long uId = JwtUtils.getUserId(request);
        for(String permission : permissions){
            if(!AuthorityUtils.verify(uId,permission)){
                return false;
            }
        }
        return true;
    }
}

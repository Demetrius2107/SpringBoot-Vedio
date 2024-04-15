package com.hua.authority;

import org.springframework.util.ObjectUtils;

import java.util.*;

public class AuthorityUtils {

    /**权限集合*/
    private static Map<Long, Collection<String>> map = new HashMap<>();

    /**过滤权限集合*/
    private static Set<String> filterPermission = new HashSet<>();

    /**全局权限校验类*/
    private static Class c;

    /**
     * 是否开启全局校验 默认为false 不开启
     */
    private static Boolean globalVerify = false;

    /**
     * 是否开启 @PostMapping 全局校验 默认为false不开启
     */
    private static Boolean postAuthority = false;


    /**
     * 设置是否开启 @PostMapping 全局校验
     * @param state
     * @param z
     */
    public static void setPostAuthority(Boolean state,Class z){
        c = z;
        postAuthority = state;
    }

    /**获取postAuthority状态
     * @return
     */
    public static Boolean getPostAuthority(){
        return postAuthority;
    }

    /**
     * 重新初始化全局校验类Class
     */
    public static void cleanVerifyClass(){
        c = null;
    }


    /**
     * 获取全局校验权限类
     * @return
     */
    public static Class getGlobalVerify(){
        return c;
    }


    /**
     * 开启全局校验
     * @param state
     * @param o
     */
    public static void setGlobalVerify(Boolean state,Object o){
        if(o == null){
            throw new NullPointerException();
        } else if(o instanceof AuthorityVerify){
            throw new ClassCastException(o.getClass() + "类型不是 AuthorityVerify实现类");
        }

        c = o.getClass();
        globalVerify = state;
    }

    /**
     * 添加权限
     * @param uid  用户id
     * @param authority 权限集合
     */
    public static void setAuthority(Long uid,Collection<String> authority){
       map.put(uid,authority);
    }

    /**
     * 权限校验
     * @param uid  用户id
     * @param authority 权限集合
     * @return
     */
    public static Boolean verify(Long uid,String authority){
        if(isEmpty(uid)){
            return false;
        }
        return map.get(uid).contains(authority);
    }


    public static Boolean isEmpty(Long uid){
        return ObjectUtils.isEmpty(map.get(uid));
    }

    /**
     * 排序权限
     * @param permissions
     */
    public static  void exclude(String permissions){
        filterPermission.addAll(Arrays.asList(permissions));
    }

    /**
     * 是否有过滤权限
     * @param permission
     * @return
     */
    public static Boolean filterPermission(String permission){
        return filterPermission.contains(permission);
    }

}

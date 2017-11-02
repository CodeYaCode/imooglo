/*
 * $Header: JsonUtils.java
 * $Revision: 1.0.0.0
 * $CreateDate: 2017年11月2日
 * $ModifyDate: 2017年11月2日
 * $Owner: LiuChen
 * 
 * Copyright (c) 2017-2027 ShangHai ChenJxx Co. Ltd.
 * All Right Reserved.
 */
package com.imooglo.util;

import com.alibaba.fastjson.JSON;
import com.imooglo.domain.User;

/**
 * JsonUtils.java
 * 
 * @author LiuChen
 * @version 1.0.0.0 2017年11月2日
 */
public class JsonUtils {
    public static String toJson(Object obj) {
        return JSON.toJSONString(obj);
    }
    
    public static <T> T toObject(String json, Class<T> clazz) {
        return JSON.parseObject(json, clazz);
    }
    
    public static void main(String[] args) {
        User user = new User();
        user.setId(123);
        String json = JsonUtils.toJson(user);
        System.out.println(json);
        User user2 = (User) JsonUtils.toObject(json, User.class);
        System.out.println(user2);
    }
}

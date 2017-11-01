/*
 * $Header: UserService.java
 * $Revision: 1.0.0.0
 * $CreateDate: 2017年10月31日
 * $ModifyDate: 2017年10月31日
 * $Owner: LiuChen
 * 
 * Copyright (c) 2017-2027 ShangHai ChenJxx Co. Ltd.
 * All Right Reserved.
 */
package com.imooglo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imooglo.domain.User;
import com.imooglo.service.IDataGetterService;
import com.imooglo.service.IUserService;

/**
 * UserService.java
 * 
 * @author LiuChen
 * @version 1.0.0.0 2017年10月31日
 */
@Service
public class UserService implements IUserService {
    @Autowired
    IDataGetterService dataGetterService;
    
    @Override
    public List<User> queryAllUsers() {
        List<User> users = new ArrayList<User>();
        users = dataGetterService.getUserDao().queryAllUser();
        return users;
    }
}

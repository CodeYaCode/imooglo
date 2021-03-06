/*
 * $Header: UserService.java
 * $Revision: 1.0.0.0
 * $CreateDate: 2017-11-07 13:58:00
 * $ModifyDate: 2017-11-07 13:58:00
 * $Owner: LiuChen
 * 
 * Copyright (c) 2017-2027 ShangHai ChenJxx Co. Ltd.
 * All Right Reserved.
 */
package com.imooglo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imooglo.domain.User;
import com.imooglo.service.IDataGetterService;
import com.imooglo.service.IUserService;

/**
 * UserService.java
 * Auto Generate By Chen
 *
 * @author LiuChen
 * @version 1.0.0.0 2017-11-07 13:58:00
 */
@Service
public class UserService implements IUserService {
    
    @Autowired
    public IDataGetterService dataGetterService;

    /**
     * 查询所有用户
     */
    @Override
    public List<User> queryAllUsers() {
        return dataGetterService.getUserDao().queryAllUser();
    }
}

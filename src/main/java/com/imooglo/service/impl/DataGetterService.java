/*
 * $Header: DataService.java
 * $Revision: 1.0.0.0
 * $CreateDate: 2017年10月31日
 * $ModifyDate: 2017年10月31日
 * $Owner: LiuChen
 * 
 * Copyright (c) 2017-2027 ShangHai ChenJxx Co. Ltd.
 * All Right Reserved.
 */
package com.imooglo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imooglo.dao.IUserDao;
import com.imooglo.service.IDataGetterService;
import com.imooglo.service.IUserService;

/**
 * DataService.java
 * 
 * @author LiuChen
 * @version 1.0.0.0 2017年10月31日
 */
@Service
public class DataGetterService implements IDataGetterService {
    /** user service */
    @Autowired
    IUserService userService;
    
    @Autowired
    IUserDao userDao;
    
    @Override
    public IUserService getUserService() {
        return userService;
    }

    @Override
    public IUserDao getUserDao() {
        return userDao;
    }
}

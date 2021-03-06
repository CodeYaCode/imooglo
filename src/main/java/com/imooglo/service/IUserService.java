/*
 * $Header: IUserService.java
 * $Revision: 1.0.0.0
 * $CreateDate: 2017-11-07 13:58:00
 * $ModifyDate: 2017-11-07 13:58:00
 * $Owner: LiuChen
 * 
 * Copyright (c) 2017-2027 ShangHai ChenJxx Co. Ltd.
 * All Right Reserved.
 */
package com.imooglo.service;

import java.util.List;

import com.imooglo.domain.User;

/**
 * IUserService.java
 * Auto Generate By Chen
 *
 * @author LiuChen
 * @version 1.0.0.0 2017-11-07 13:58:00
 */
public interface IUserService {
    /**
     * 查询所有用户
     * @return
     */
    List<User> queryAllUsers();
}

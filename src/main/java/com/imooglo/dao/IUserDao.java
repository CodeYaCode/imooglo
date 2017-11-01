/*
 * $Header: IUserDao.java
 * $Revision: 1.0.0.0
 * $CreateDate: 2017年11月1日
 * $ModifyDate: 2017年11月1日
 * $Owner: LiuChen
 * 
 * Copyright (c) 2017-2027 ShangHai ChenJxx Co. Ltd.
 * All Right Reserved.
 */
package com.imooglo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import com.imooglo.domain.User;

/**
 * IUserDao.java
 * 
 * @author LiuChen
 * @version 1.0.0.0 2017年11月1日
 */
@Component
public interface IUserDao {
    @Select("select * from USER")
    List<User> queryAllUser();
}

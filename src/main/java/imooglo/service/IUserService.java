/*
 * $Header: IUserService.java
 * $Revision: 1.0.0.0
 * $CreateDate: 2017年10月31日
 * $ModifyDate: 2017年10月31日
 * $Owner: LiuChen
 * 
 * Copyright (c) 2017-2027 ShangHai ChenJxx Co. Ltd.
 * All Right Reserved.
 */
package imooglo.service;

import java.util.List;

import imooglo.domain.User;

/**
 * IUserService.java
 * 
 * @author LiuChen
 * @version 1.0.0.0 2017年10月31日
 */
public interface IUserService {
    /**
     * 查询所有的用户
     */
    public List<User> queryAllUsers();
}

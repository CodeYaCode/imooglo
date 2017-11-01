/*
 * $Header: IDataService.java
 * $Revision: 1.0.0.0
 * $CreateDate: 2017年10月31日
 * $ModifyDate: 2017年10月31日
 * $Owner: LiuChen
 * 
 * Copyright (c) 2017-2027 ShangHai ChenJxx Co. Ltd.
 * All Right Reserved.
 */
package com.imooglo.service;

import com.imooglo.dao.IUserDao;

/**
 * IDataService.java
 * 
 * @author LiuChen
 * @version 1.0.0.0 2017年10月31日
 */
public interface IDataGetterService {
    /**
     * Get user dao
     * @return
     */
    public IUserDao getUserDao();
    
    /**
     * Get user service
     * @return
     */
    public IUserService getUserService();
}

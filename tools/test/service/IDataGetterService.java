/*
 * $Header: IDataGetterService.java
 * $Revision: 1.0.0.0
 * $CreateDate: 2017-11-07 10:39:25
 * $ModifyDate: 2017-11-07 10:39:25
 * $Owner: LiuChen
 * 
 * Copyright (c) 2017-2027 ShangHai ChenJxx Co. Ltd.
 * All Right Reserved.
 */
package com.imooglo.service;

import com.imooglo.dao.IAndOneDao;
import com.imooglo.dao.IBeforeTomorrowDao;
import com.imooglo.service.IAndOneService;
import com.imooglo.service.IBeforeTomorrowService;

/**
 * IDataGetterService.java
 * Auto Generate By Chen
 *
 * @author LiuChen
 * @version 1.0.0.0 2017-11-07 10:39:25
 */
public interface IDataGetterService {
    
    /**
     * IAndOneDao
     * @return
     */
    IAndOneDao getAndOneDao();

    /**
     * IBeforeTomorrowDao
     * @return
     */
    IBeforeTomorrowDao getBeforeTomorrowDao();

    /**
     * IAndOneService
     * @return
     */
    IAndOneService getAndOneService();

    /**
     * IBeforeTomorrowService
     * @return
     */
    IBeforeTomorrowService getBeforeTomorrowService();

}

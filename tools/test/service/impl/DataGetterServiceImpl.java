/*
 * $Header: DataGetterServiceImpl.java
 * $Revision: 1.0.0.0
 * $CreateDate: 2017-11-07 10:39:25
 * $ModifyDate: 2017-11-07 10:39:25
 * $Owner: LiuChen
 * 
 * Copyright (c) 2017-2027 ShangHai ChenJxx Co. Ltd.
 * All Right Reserved.
 */
package com.imooglo.service.impl;

import com.imooglo.dao.IAndOneDao;
import com.imooglo.dao.IBeforeTomorrowDao;
import com.imooglo.service.IAndOneService;
import com.imooglo.service.IBeforeTomorrowService;

/**
 * DataGetterServiceImpl.java
 * Auto Generate By Chen
 *
 * @author LiuChen
 * @version 1.0.0.0 2017-11-07 10:39:25
 */
@Service
public class DataGetterServiceImpl implements IDataGetterService {
    
	@Autowired
    public IAndOneDao andOneDao;

	@Autowired
    public IBeforeTomorrowDao beforeTomorrowDao;

	@Autowired
    public IAndOneService andOneService;

	@Autowired
    public IBeforeTomorrowService beforeTomorrowService;

    @Override
    public IAndOneDao getAndOneDao() {
        return andOneDao;
    }

    @Override
    public IBeforeTomorrowDao getBeforeTomorrowDao() {
        return beforeTomorrowDao;
    }

    @Override
    public IAndOneService getAndOneService() {
        return andOneService;
    }

    @Override
    public IBeforeTomorrowService getBeforeTomorrowService() {
        return beforeTomorrowService;
    }

}

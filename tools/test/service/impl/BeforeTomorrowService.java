/*
 * $Header: BeforeTomorrowService.java
 * $Revision: 1.0.0.0
 * $CreateDate: 2017-11-07 10:39:25
 * $ModifyDate: 2017-11-07 10:39:25
 * $Owner: LiuChen
 * 
 * Copyright (c) 2017-2027 ShangHai ChenJxx Co. Ltd.
 * All Right Reserved.
 */
package com.imooglo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imooglo.service.IDataGetterService;
import com.imooglo.service.IBeforeTomorrowService;

/**
 * BeforeTomorrowService.java
 * Auto Generate By Chen
 *
 * @author LiuChen
 * @version 1.0.0.0 2017-11-07 10:39:25
 */
@Service
public class BeforeTomorrowService implements IBeforeTomorrowService {
    
    @Autowired
    public IDataGetterService dataGetterService;
}

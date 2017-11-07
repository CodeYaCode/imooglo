/*
 * $Header: MedicalRecordService.java
 * $Revision: 1.0.0.0
 * $CreateDate: 2017-11-07 13:58:00
 * $ModifyDate: 2017-11-07 13:58:00
 * $Owner: LiuChen
 * 
 * Copyright (c) 2017-2027 ShangHai ChenJxx Co. Ltd.
 * All Right Reserved.
 */
package com.imooglo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imooglo.service.IDataGetterService;
import com.imooglo.service.IMedicalRecordService;

/**
 * MedicalRecordService.java
 * Auto Generate By Chen
 *
 * @author LiuChen
 * @version 1.0.0.0 2017-11-07 13:58:00
 */
@Service
public class MedicalRecordService implements IMedicalRecordService {
    
    @Autowired
    public IDataGetterService dataGetterService;
}

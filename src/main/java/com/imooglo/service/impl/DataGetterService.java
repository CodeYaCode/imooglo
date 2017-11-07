/*
 * $Header: DataGetterService.java
 * $Revision: 1.0.0.0
 * $CreateDate: 2017-11-07 14:08:52
 * $ModifyDate: 2017-11-07 14:08:52
 * $Owner: LiuChen
 * 
 * Copyright (c) 2017-2027 ShangHai ChenJxx Co. Ltd.
 * All Right Reserved.
 */
package com.imooglo.service.impl;

import com.imooglo.dao.IHospitalDao;
import com.imooglo.dao.IMedicalRecordDao;
import com.imooglo.dao.IPetDao;
import com.imooglo.dao.IUserDao;
import com.imooglo.service.IHospitalService;
import com.imooglo.service.IMedicalRecordService;
import com.imooglo.service.IPetService;
import com.imooglo.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imooglo.service.IDataGetterService;

/**
 * DataGetterService.java
 * Auto Generate By Chen
 *
 * @author LiuChen
 * @version 1.0.0.0 2017-11-07 14:08:52
 */
@Service
public class DataGetterService implements IDataGetterService {
    
	@Autowired
    public IHospitalDao hospitalDao;

	@Autowired
    public IMedicalRecordDao medicalRecordDao;

	@Autowired
    public IPetDao petDao;

	@Autowired
    public IUserDao userDao;

	@Autowired
    public IHospitalService hospitalService;

	@Autowired
    public IMedicalRecordService medicalRecordService;

	@Autowired
    public IPetService petService;

	@Autowired
    public IUserService userService;

    @Override
    public IHospitalDao getHospitalDao() {
        return hospitalDao;
    }

    @Override
    public IMedicalRecordDao getMedicalRecordDao() {
        return medicalRecordDao;
    }

    @Override
    public IPetDao getPetDao() {
        return petDao;
    }

    @Override
    public IUserDao getUserDao() {
        return userDao;
    }

    @Override
    public IHospitalService getHospitalService() {
        return hospitalService;
    }

    @Override
    public IMedicalRecordService getMedicalRecordService() {
        return medicalRecordService;
    }

    @Override
    public IPetService getPetService() {
        return petService;
    }

    @Override
    public IUserService getUserService() {
        return userService;
    }

}

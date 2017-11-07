/*
 * $Header: IDataGetterService.java
 * $Revision: 1.0.0.0
 * $CreateDate: 2017-11-07 14:08:52
 * $ModifyDate: 2017-11-07 14:08:52
 * $Owner: LiuChen
 * 
 * Copyright (c) 2017-2027 ShangHai ChenJxx Co. Ltd.
 * All Right Reserved.
 */
package com.imooglo.service;

import com.imooglo.dao.IHospitalDao;
import com.imooglo.dao.IMedicalRecordDao;
import com.imooglo.dao.IPetDao;
import com.imooglo.dao.IUserDao;
import com.imooglo.service.IHospitalService;
import com.imooglo.service.IMedicalRecordService;
import com.imooglo.service.IPetService;
import com.imooglo.service.IUserService;

/**
 * IDataGetterService.java
 * Auto Generate By Chen
 *
 * @author LiuChen
 * @version 1.0.0.0 2017-11-07 14:08:52
 */
public interface IDataGetterService {
    
    /**
     * IHospitalDao
     * @return
     */
    IHospitalDao getHospitalDao();

    /**
     * IMedicalRecordDao
     * @return
     */
    IMedicalRecordDao getMedicalRecordDao();

    /**
     * IPetDao
     * @return
     */
    IPetDao getPetDao();

    /**
     * IUserDao
     * @return
     */
    IUserDao getUserDao();

    /**
     * IHospitalService
     * @return
     */
    IHospitalService getHospitalService();

    /**
     * IMedicalRecordService
     * @return
     */
    IMedicalRecordService getMedicalRecordService();

    /**
     * IPetService
     * @return
     */
    IPetService getPetService();

    /**
     * IUserService
     * @return
     */
    IUserService getUserService();

}

/*
 * $Header: MedicalRecord.java
 * $Revision: 1.0.0.0
 * $CreateDate: 2017-11-03 17:32:46
 * $ModifyDate: 2017-11-03 17:32:46
 * $Owner: LiuChen
 * 
 * Copyright (c) 2017-2027 ShangHai ChenJxx Co. Ltd.
 * All Right Reserved.
 */
package com.imooglo.domain;

/**
 * MedicalRecord.java
 * Auto Generate By Chen
 *
 * @author LiuChen
 * @version 1.0.0.0 2017-11-03 17:32:46
 */
public class MedicalRecord {
    /**  */
    public int id;
    /** 医院ID */
    public int hospitalId;
    /** 疾病 */
    public String disease;
    /** 使用的药物（多个用;隔开） */
    public String medicines;
    /** 详情 */
    public String detail;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHospitalId() {
        return this.hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getDisease() {
        return this.disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getMedicines() {
        return this.medicines;
    }

    public void setMedicines(String medicines) {
        this.medicines = medicines;
    }

    public String getDetail() {
        return this.detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

// -*- SELF CODE START -*-

// -*- SELF CODE END -*-
}
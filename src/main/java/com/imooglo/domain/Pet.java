/*
 * $Header: Pet.java
 * $Revision: 1.0.0.0
 * $CreateDate: 2017-11-03 17:25:48
 * $ModifyDate: 2017-11-03 17:25:48
 * $Owner: LiuChen
 * 
 * Copyright (c) 2017-2027 ShangHai ChenJxx Co. Ltd.
 * All Right Reserved.
 */
package com.imooglo.domain;

/**
 * Pet.java
 * Auto Generate By Chen
 *
 * @author LiuChen
 * @version 1.0.0.0 2017-11-03 17:25:48
 */
public class Pet {
    /** PET自增ID */
    public int id;
    /**  */
    public String userId;
    /** 医保卡号 */
    public String medicalNumber;
    /** 宠物种类 */
    public String genus;
    /** 身高 */
    public double height;
    /** 体重 */
    public double weight;
    /** 创建时间 */
    public long createTime;
    /** 更新时间 */
    public long updateTime;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMedicalNumber() {
        return this.medicalNumber;
    }

    public void setMedicalNumber(String medicalNumber) {
        this.medicalNumber = medicalNumber;
    }

    public String getGenus() {
        return this.genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

// -*- SELF CODE START -*-

// -*- SELF CODE END -*-
}
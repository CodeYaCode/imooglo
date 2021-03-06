/*
 * $Header: Hospital.java
 * $Revision: 1.0.0.0
 * $CreateDate: 2017-11-02 18:13:18
 * $ModifyDate: 2017-11-02 18:13:18
 * $Owner: LiuChen
 * 
 * Copyright (c) 2017-2027 ShangHai ChenJxx Co. Ltd.
 * All Right Reserved.
 */
package com.imooglo.domain;

/**
 * Hospital.java
 * Auto Generate By Chen
 *
 * @author LiuChen
 * @version 1.0.0.0 2017-11-02 18:13:18
 */
public class Hospital {
    /** 医院ID */
    public int id;
    /** 医院名称 */
    public String name;
    /** 所在国家 */
    public String country;
    /** 城市 */
    public String city;
    /** 所在区域 */
    public String district;
    /** 具体地址 */
    public String address;
    /** 上岗兽医（多名用；隔开） */
    public String doctor;
    /** 法人 */
    public String legalPerson;
    /** 电话 */
    public String telephone;
    /** 星级 */
    public int star;
    /** 创建时间 */
    public long createTime;
    /** 最后更新时间 */
    public long updateTime;
    /** 权重 */
    public double weight;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return this.district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDoctor() {
        return this.doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getLegalPerson() {
        return this.legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getStar() {
        return this.star;
    }

    public void setStar(int star) {
        this.star = star;
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

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

// -*- SELF CODE START -*-




// -*- SELF CODE END -*-
}
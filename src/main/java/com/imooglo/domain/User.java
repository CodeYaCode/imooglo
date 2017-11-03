/*
 * $Header: User.java
 * $Revision: 1.0.0.0
 * $CreateDate: 2017-11-03 16:58:41
 * $ModifyDate: 2017-11-03 16:58:41
 * $Owner: LiuChen
 * 
 * Copyright (c) 2017-2027 ShangHai ChenJxx Co. Ltd.
 * All Right Reserved.
 */
package com.imooglo.domain;

/**
 * User.java
 * Auto Generate By Chen
 *
 * @author LiuChen
 * @version 1.0.0.0 2017-11-03 16:58:41
 */
public class User {
    /** USER_ID自增 */
    public int id;
    /** 用户ID */
    public String userId;
    /** 账号 */
    public String account;
    /** 密码 */
    public String password;
    /** 昵称 */
    public String nickname;
    /** 微信 */
    public String wechat;
    /** 创建时间 */
    public long createTime;
    /** 更新时间 */
    public long updateTime;
    /** 上次登陆时间 */
    public long lastLoginTime;

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

    public String getAccount() {
        return this.account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getWechat() {
        return this.wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
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

    public long getLastLoginTime() {
        return this.lastLoginTime;
    }

    public void setLastLoginTime(long lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

// -*- SELF CODE START -*-

// -*- SELF CODE END -*-
}
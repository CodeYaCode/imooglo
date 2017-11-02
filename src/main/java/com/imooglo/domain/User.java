/*
 * $Header: User.java
 * $Revision: 1.0.0.0
 * $CreateDate: 2017年10月31日
 * $ModifyDate: 2017年10月31日
 * $Owner: LiuChen
 * 
 * Copyright (c) 2017-2027 ShangHai ChenJxx Co. Ltd.
 * All Right Reserved.
 */
package com.imooglo.domain;

/**
 * User.java
 * 
 * @author LiuChen
 * @version 1.0.0.0 2017年10月31日
 */
public class User {
    /** 自增主键 */
    private int id;
    
    /** 昵称 */
    private String nickname;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}

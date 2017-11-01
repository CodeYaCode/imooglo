/*
 * $Header: IndexController.java
 * $Revision: 1.0.0.0
 * $CreateDate: 2017年10月30日
 * $ModifyDate: 2017年10月30日
 * $Owner: LiuChen
 * 
 * Copyright (c) 2017-2027 ShangHai ChenJxx Co. Ltd.
 * All Right Reserved.
 */
package com.imooglo.controller.index;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imooglo.controller.BaseController;
import com.imooglo.domain.User;
import com.imooglo.service.IDataGetterService;

/**
 * IndexController.java
 * 
 * @author LiuChen
 * @version 1.0.0.0 2017年10月30日
 */
@RestController
public class IndexController extends BaseController {
    @Autowired
    public IDataGetterService dataGetterService;
    
    @RequestMapping("/")
    public String index() {
        List<User> users = dataGetterService.getUserService().queryAllUsers();
        System.out.println(users.get(0).getId());
        return "Hello World!";
    }
}

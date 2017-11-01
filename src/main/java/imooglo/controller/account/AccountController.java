/*
 * $Header: AccountController.java
 * $Revision: 1.0.0.0
 * $CreateDate: 2017年10月30日
 * $ModifyDate: 2017年10月30日
 * $Owner: LiuChen
 * 
 * Copyright (c) 2017-2027 ShangHai ChenJxx Co. Ltd.
 * All Right Reserved.
 */
package imooglo.controller.account;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import imooglo.controller.BaseController;

/**
 * AccountController.java
 * 
 * @author LiuChen
 * @version 1.0.0.0 2017年10月30日
 */
@RestController
public class AccountController extends BaseController {
    @RequestMapping(value="/login", method=RequestMethod.GET)
    public String login(HttpServletRequest request) {
        HttpSession session = request.getSession();
        System.out.println(session.getId());
        return "login";
    }
    
    @RequestMapping(value="/register", method=RequestMethod.GET)
    public String register() {
        return "register";
    }
}

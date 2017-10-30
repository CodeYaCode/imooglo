/*
 * $Header: IndexAction.java
 * $Revision: 1.0.0.0
 * $CreateDate: 2017年10月30日
 * $ModifyDate: 2017年10月30日
 * $Owner: LiuChen
 * 
 * Copyright (c) 2017-2027 ShangHai ChenJxx Co. Ltd.
 * All Right Reserved.
 */
package imooglo.action.index;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import imooglo.action.BaseAction;

/**
 * IndexAction.java
 * 
 * @author LiuChen
 * @version 1.0.0.0 2017年10月30日
 */
@RestController
public class IndexAction extends BaseAction {
    @RequestMapping("/")
    public String index() {
        return "Hello World!";
    }
}

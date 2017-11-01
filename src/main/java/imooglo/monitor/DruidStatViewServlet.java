/*
 * $Header: DruidStatViewServlet.java
 * $Revision: 1.0.0.0
 * $CreateDate: 2017年11月1日
 * $ModifyDate: 2017年11月1日
 * $Owner: LiuChen
 * 
 * Copyright (c) 2017-2027 ShangHai ChenJxx Co. Ltd.
 * All Right Reserved.
 */
package imooglo.monitor;

import com.alibaba.druid.support.http.StatViewServlet;

/**
 * DruidStatViewServlet.java
 * 
 * @author LiuChen
 * @version 1.0.0.0 2017年11月1日
 */
//@WebServlet(urlPatterns = "/druid/*",   
//initParams={  
//        @WebInitParam(name="allow",value="192.168.16.110,127.0.0.1"),// IP白名单 (没有配置或者为空，则允许所有访问)  
//        @WebInitParam(name="deny",value="192.168.16.111"),// IP黑名单 (存在共同时，deny优先于allow)  
//        @WebInitParam(name="loginUsername",value="admin"),// 用户名  
//        @WebInitParam(name="loginPassword",value="123"),// 密码  
//        @WebInitParam(name="resetEnable",value="false")// 禁用HTML页面上的“Reset All”功能  
//})  
public class DruidStatViewServlet extends StatViewServlet {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

}

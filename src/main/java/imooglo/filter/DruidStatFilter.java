/*
 * $Header: DruidStatFilter.java
 * $Revision: 1.0.0.0
 * $CreateDate: 2017年11月1日
 * $ModifyDate: 2017年11月1日
 * $Owner: LiuChen
 * 
 * Copyright (c) 2017-2027 ShangHai ChenJxx Co. Ltd.
 * All Right Reserved.
 */
package imooglo.filter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

import com.alibaba.druid.support.http.WebStatFilter;

/**
 * DruidStatFilter.java
 * 
 * @author LiuChen
 * @version 1.0.0.0 2017年11月1日
 */
@WebFilter(filterName="druidWebStatFilter", urlPatterns="/*",
    initParams= {
            @WebInitParam(name="exclusions", value="*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")
    }
)
public class DruidStatFilter extends WebStatFilter {

}

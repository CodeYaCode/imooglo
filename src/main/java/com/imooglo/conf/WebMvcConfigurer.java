/*
 * $Header: WebMvcConfigurer.java
 * $Revision: 1.0.0.0
 * $CreateDate: 2017年11月2日
 * $ModifyDate: 2017年11月2日
 * $Owner: LiuChen
 * 
 * Copyright (c) 2017-2027 ShangHai ChenJxx Co. Ltd.
 * All Right Reserved.
 */
package com.imooglo.conf;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

/**
 * WebMvcConfigurer.java
 * 配置Spring使用FastJson作为converter
 * @author LiuChen
 * @version 1.0.0.0 2017年11月2日
 */
//@Configuration
public class WebMvcConfigurer extends WebMvcConfigurerAdapter {
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
        //自定义配置...
        //FastJsonConfig config = new FastJsonConfig();
        //config.set ...
        //converter.setFastJsonConfig(config);
        converters.add(converter);
    }
}

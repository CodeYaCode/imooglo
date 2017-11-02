/*
 * $Header: ImoogloMain.java
 * $Revision: 1.0.0.0
 * $CreateDate: 2017年10月30日
 * $ModifyDate: 2017年10月30日
 * $Owner: LiuChen
 * 
 * Copyright (c) 2017-2027 ShangHai ChenJxx Co. Ltd.
 * All Right Reserved.
 */
package com.imooglo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * ImoogloMain.java
 * 
 * @author LiuChen
 * @version 1.0.0.0 2017年10月30日
 */
@SpringBootApplication(scanBasePackages = "com.imooglo.*")
@ServletComponentScan
@EnableScheduling
public class ImoogloMain {

    public static void main(String[] args) {
        SpringApplication.run(ImoogloMain.class, args);
    }
}

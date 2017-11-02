/*
 * $Header: TestTask.java
 * $Revision: 1.0.0.0
 * $CreateDate: 2017年11月2日
 * $ModifyDate: 2017年11月2日
 * $Owner: LiuChen
 * 
 * Copyright (c) 2017-2027 ShangHai ChenJxx Co. Ltd.
 * All Right Reserved.
 */
package com.imooglo.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * TestTask.java
 * 
 * @author LiuChen
 * @version 1.0.0.0 2017年11月2日
 */
@Component
public class TestTask {
//    @Scheduled(fixedDelay=1 * 1000)
    public void task() {
        System.out.println("hello");
    }
}

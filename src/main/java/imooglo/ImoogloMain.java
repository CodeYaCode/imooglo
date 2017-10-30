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
package imooglo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ImoogloMain.java
 * @author LiuChen
 * @version 1.0.0.0 2017年10月30日
 */
@Controller
@EnableAutoConfiguration
public class ImoogloMain {
    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Hello World!";
    }
    
    public static void main(String[] args) {
        SpringApplication.run(ImoogloMain.class, args);
    }
}

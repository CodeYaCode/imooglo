/*
 * $Header: DruidDataSourceConfiguration.java
 * $Revision: 1.0.0.0
 * $CreateDate: 2017年11月1日
 * $ModifyDate: 2017年11月1日
 * $Owner: LiuChen
 * 
 * Copyright (c) 2017-2027 ShangHai ChenJxx Co. Ltd.
 * All Right Reserved.
 */
package imooglo.conf;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * DruidDataSourceConfiguration.java
 * 
 * @author LiuChen
 * @version 1.0.0.0 2017年11月1日
 */
@Configuration
public class DruidDataSourceConfiguration {
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource druidDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        
        return druidDataSource;
    }
}

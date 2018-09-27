package com.yijiupi.com.springbootdemo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring.dataSource.primaryDataSource")
public class DruidPrimaryDataSourceConfigProperties {
	
}
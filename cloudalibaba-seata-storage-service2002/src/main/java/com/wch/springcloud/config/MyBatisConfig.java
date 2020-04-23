package com.wch.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.wch.springcloud.dao"})
public class MyBatisConfig {




}

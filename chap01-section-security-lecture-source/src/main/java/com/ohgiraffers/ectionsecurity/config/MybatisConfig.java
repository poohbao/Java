package com.ohgiraffers.ectionsecurity.config;

import org.apache.catalina.mapper.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.ohgiraffers.sessionsecurity", annotationClass = Mapper.class)
public class MybatisConfig {

}

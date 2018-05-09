package com.example.user.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author： ygl
 * @date： 2018/3/26
 * @Description：
 */
@Configuration
@MapperScan(MybatisConfig.basePackages)
public class MybatisConfig {

    /**
     * mapper 包路径
     */
    public final static String basePackages = "com.example.user.mapper";
}

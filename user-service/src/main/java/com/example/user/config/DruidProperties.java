package com.example.user.config;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author： ygl
 * @date： 2018/3/20-16:42
 * @Description：
 * alibaba DruidDataSource properties
 */
@Data
@Configuration
public class DruidProperties {

    /**############################# 连接池配置 #############################**/
    /**
     * 配置初始化大小、最小、最大
     */
    private int initialSize = 1;
    private int minIdle = 1;
    private int maxActive = 2;
    private int maxWait = 6000;
}
package com.springboot.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * @ClassName:JdbcConfiguration
 * @Description:
 * @author:chenyun
 * @Date:2019/12/16 8:40
 */
//使用@Configuration注解声明这是一个java配置文件，相当于xml配置文件
@Configuration
//开启配置属性文件
@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfiguration {

    //在这类注入属性配置文件
    @Autowired
    private JdbcProperties jdbcProperties;

    //把方法的返回值注入到spring容器
    //由于需要把返回值注入到bean，所以需要一个bean注解
    @Bean
    //可以在方法上使用@ConfigurationProperties注解，在方法上使用注解的时候如下
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource dataSource(){
        //因为要使用数据库连接池，所以需要加入阿里巴巴druid的依赖
        DruidDataSource dataSource = new DruidDataSource();

      /*  //设置数据库连接的属性
        dataSource.setDriverClassName(jdbcProperties.getDriverClassName());
        dataSource.setUrl(jdbcProperties.getUrl());
        dataSource.setUsername(jdbcProperties.getUsername());
        dataSource.setPassword(jdbcProperties.getPassword());*/
        return dataSource;
        //这样就可以在任意位置注入使用datasource了

    }
}

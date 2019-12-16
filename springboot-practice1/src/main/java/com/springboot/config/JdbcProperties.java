package com.springboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ClassName:JdbcProperties
 * @Description:
 * @author:chenyun
 * @Date:2019/12/16 17:10
 */

//加入一个属性配置注解,它是根据前缀进行识别配置文件中所需的配置的
//这个注解会去扫描springboot中的配置文件中以jdbc开头的配置
@ConfigurationProperties(prefix = "jdbc")
public class JdbcProperties {

    private String driverClassName;
    private String url;
    private String username;
    private String password;

    //需要加入set和get方法

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

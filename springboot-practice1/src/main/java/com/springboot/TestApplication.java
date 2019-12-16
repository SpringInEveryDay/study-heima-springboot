package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName:TestApplication
 * @Description:
 * @author:chenyun
 * @Date:2019/12/16 8:05
 */
//加入自动配置注解，这样就可以进行自动装机配置
//@EnableAutoConfiguration
//加入扫描包的注解，如果指定位置他就会扫描指定位置的controller，不指定位置就会扫描当前包下的内容
//@ComponentScan
//千万不要把Applcation启动类放在任何一个子包中，引导类是springboot项目的入口
//如果每次写以上那么多注解会很麻烦，所以SpringBoot为我们提供了SpringBootApplication注解
@SuppressWarnings("ALL")
@SpringBootApplication
//@SpringBootApplication注解相当于结合了@EableAutoConfiguration和@ComponentScan注解还有@SpringBootConfiguration注解
//Configuration是一个java配置类，声明一个类为java配置
public class TestApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class,args);
    }
}

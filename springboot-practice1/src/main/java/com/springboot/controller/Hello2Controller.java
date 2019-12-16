package com.springboot.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName:HelloController
 * @Description:
 * @author:chenyun
 * @Date:2019/12/13 17:32
 */
//加以下这个@RestController注解相当于加了@Controller和@ResponseBody两个注解，加上这个注解的方法返回的都是json数据
@RestController
//加上以下这个注解就是加了一个全局的访问前缀，这样访问的时候就相当于在每个方法的访问前缀下又加了一个前缀
@RequestMapping("/hello2")
//加入以下注解启动自动配置
@EnableAutoConfiguration
public class Hello2Controller {

    //定义一个返回字符串的方法
    @GetMapping("/getHello")
    public String getHello(){
        return "你好，四字弟弟易烊千玺2号";
    }

    //模拟启动类
    public static void main(String[] args) {
        //要启动哪个类就是哪个类的class
        SpringApplication.run(Hello2Controller.class,args);
    }
}

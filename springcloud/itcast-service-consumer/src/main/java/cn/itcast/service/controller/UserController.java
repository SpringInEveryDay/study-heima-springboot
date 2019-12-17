package cn.itcast.service.controller;



import cn.itcast.service.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName:UserContytroller
 * @Description:
 * @author:chenyun
 * @Date:2019/12/17 15:45
 */
//使用这个注解声明这个类是一个controller类
@Controller
//声明全局访问的前缀
@RequestMapping("consumer/user")
public class UserController {
    //将RestTemplate注入
    @Autowired
    private RestTemplate restTemplate;

    //通过远程调用的方法根据id查用户
    @GetMapping
    @ResponseBody
    public User queryUserById(@RequestParam("id")Long id){
        return restTemplate.getForObject("http://localhost:8081/user/"+id, User.class);
    }

}

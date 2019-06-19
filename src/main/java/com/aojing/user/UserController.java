package com.aojing.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: gexiao
 * @Date: 2019/6/19 09:16
 * @Description:
 */
@RestController
@RequestMapping("api/user")
public class UserController {

    @GetMapping("test")
    public String test(@RequestParam(name = "str",required = false) String str){
        return "用户服务的响应，传入参数为："+str;
    }
}

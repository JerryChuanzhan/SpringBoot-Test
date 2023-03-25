package com.zcz.hello_world.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: 第一个spring boot接口
 * @ClassName: HelloController
 * @Author: ZCZ
 * @Date 2023年03月23日 23:54
 **/
// 热部署
@Controller
public class HelloController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello,World!";
    }
}

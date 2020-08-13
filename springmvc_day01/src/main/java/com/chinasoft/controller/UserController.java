package com.chinasoft.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 *  RequestMapping注解：
 *          属性： value或path
 *
 */
@Controller
@RequestMapping("user")
public class UserController {


    @RequestMapping("hello")
    public String hello(){
        return "success";
    }


    /**
     *  RequestMapping中的属性
     *      path；指定请求的路径
     *      method:指定请求的方式 GET POST PUT DELETE
     *      herders:表示访问时必须带有指定的请求头
     *      parms:表示访问时必须带有指定的参数名的参数
     * @return
     */
    @RequestMapping(path = "addUser",method = RequestMethod.GET)
    public String addUser(){
        return "success";
    }
}

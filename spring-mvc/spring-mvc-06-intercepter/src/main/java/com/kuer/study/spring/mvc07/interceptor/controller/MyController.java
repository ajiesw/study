package com.kuer.study.spring.mvc07.interceptor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author kuer
 */
@Controller
public class MyController {

    @RequestMapping("hello")
    @ResponseBody
    public String test(){

        return "hello";
    }
}

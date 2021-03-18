package com.kuer.study.mvc03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author kuer
 */
@Controller
public class MyController {

    @RequestMapping("hello")
    public String hello(Model model){
        // 通过model封装数据
        model.addAttribute("msg","hello,mvc annotation");
        //返回的字符串会被视图解析器处理
        return "hello";
    }
}

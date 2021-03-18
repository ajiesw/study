package com.kuer.study.spring.mvc04.controller;

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
        model.addAttribute("msg", "kuer");
        return "hello";
    }
}

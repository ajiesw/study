package com.kuer.study.mvc.ssm.controller;

import com.kuer.study.mvc.ssm.pojo.User;
import com.kuer.study.mvc.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author kuer
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/getUser")
    public String getUser(Model model){
        List<User> list = userService.getList(new User());
        model.addAttribute("msg", list);
        return "hellomvc";
    }
}

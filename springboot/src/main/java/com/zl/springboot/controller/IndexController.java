package com.zl.springboot.controller;

import com.zl.springboot.entity.User;
import com.zl.springboot.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {

    @Autowired
    public UserService userService;

    @RequestMapping("/hello")
    public String toHello(Model model, HttpServletRequest request){
        System.out.print("---------------------------");
        User u = userService.findByPK(1);
        if(u != null){
            model.addAttribute("name", u.getUsername());
        }else{
            model.addAttribute("name", "there is no people");
        }
        return "hellospringboot";
    }
}

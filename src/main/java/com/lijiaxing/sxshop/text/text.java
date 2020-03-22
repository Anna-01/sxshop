package com.lijiaxing.sxshop.text;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class text {
    @RequestMapping("/hello")
    public String hello(){
        System.out.print("你好");
    return "hello";
    }
}

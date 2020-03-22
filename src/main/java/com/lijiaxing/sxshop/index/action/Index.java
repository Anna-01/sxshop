package com.lijiaxing.sxshop.index.action;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Index {
    @RequestMapping("/index")
    public String shouye() {
        System.out.println("index");
        return "index";
    }

}

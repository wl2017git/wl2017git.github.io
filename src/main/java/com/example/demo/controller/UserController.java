package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class UserController {
    @RequestMapping("/index")
    public String index(){
        log.info("进入方法");
        return "index";
    }
}

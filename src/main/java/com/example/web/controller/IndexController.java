package com.example.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author Nick
 * @Classname IndexController
 * @Date 2021/7/23 16:29
 * @Description
 */
@Controller
public class IndexController {
    @GetMapping(value = {"/","index","login"})
    public String indexLogin(){
        return "login";
    }
}

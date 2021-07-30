package com.example.web.controller;

import com.example.web.bean.User;
import com.example.web.exception.UserTooMuchException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

/**
 * @Author Nick
 * @Classname TableController
 * @Date 2021/7/26 10:24
 * @Description Table页
 */
@Controller
public class TableController {

    //查看模板页
    @GetMapping("/common")
    public String common(){
        return "common";
    }
    @GetMapping("/responsive_table.html")
    public String responsive_table(Model model){
//        List<User> users = Arrays.asList(new User("xk01", "123"),
//                new User("xk02", "123"),
//                new User("xk03", "123"),
//                new User("xk04", "123"),
//                new User("xk05", "123"),
//                new User("xk06", "123"));
//        model.addAttribute("users",users);
//        if(users.size()>3){
//            throw new UserTooMuchException("用户数量太多！！！");
//        }
        return "table/responsive_table";
    }

    @GetMapping("pricing_table.html")
    public String pricing_table(){
        return "table/pricing_table";
    }

    @GetMapping("editable_table.html")
    public String editable_table(){
        return "table/editable_table";
    }

    @GetMapping("dynamic_table.html")
    public String dynamic_table(){
        return "/table/dynamic_table";
    }

    @GetMapping("basic_table.html")
    public String basic_table(@RequestParam("a") int a){
//        int i = 10/0;//此处属于算数异常
        return "/table/basic_table";
    }
}

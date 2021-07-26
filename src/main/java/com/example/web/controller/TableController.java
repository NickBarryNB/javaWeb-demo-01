package com.example.web.controller;

import com.example.web.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
        List<User> users = Arrays.asList(new User("xk01", "123"),
                new User("xk02", "123"),
                new User("xk03", "123"),
                new User("xk04", "123"),
                new User("xk05", "123"),
                new User("xk06", "123"));
        model.addAttribute("users",users);
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
    public String basic_table(){
        return "/table/basic_table";
    }
}

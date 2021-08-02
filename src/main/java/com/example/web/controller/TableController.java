package com.example.web.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.web.bean.User;
import com.example.web.exception.UserTooMuchException;
import com.example.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

    @Autowired
    UserService userService;

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


    /**
     * 删除用户ById
     * @param id    要删除用户的id
     * @param pn    当前页码
     * @param redirectAttributes    重定向的目标
     * @return
     */
    @GetMapping("/user/delete/{id}")
    public String deleteUser(@PathVariable("id")Long id,
                             @RequestParam(value = "pn",defaultValue = "1")Integer pn,
                             RedirectAttributes redirectAttributes){
        userService.removeById(id);
        redirectAttributes.addAttribute("pn",pn);
        return "redirect:/dynamic_table.html";
    }
    /**
     *
     * @param pn    当前页码
     * @param model
     * @return
     */
    @GetMapping("dynamic_table.html")
    public String dynamic_table(@RequestParam(value = "pn",defaultValue = "1")Integer pn,
                                Model model){

//        List<User> list = userService.list();
//        model.addAttribute("users_list",list);

        //构造分页参数  （当前页，每页显示的条数）
        Page<User> page = new Page<>(pn,3);
        //调用page进行分页
        Page<User> userPage = userService.page(page, null);
        //当前页
        long current = page.getCurrent();
        //总页数
        long pages = page.getPages();
        //总记录数
        long total = page.getTotal();
        //数据库可遍历对象
        List<User> records = page.getRecords();

        model.addAttribute("users_page",userPage);
        return "/table/dynamic_table";
    }

    @GetMapping("basic_table.html")
    public String basic_table(/*@RequestParam("a") int a*/){
//        int i = 10/0;//此处属于算数异常
        return "/table/basic_table";
    }
}

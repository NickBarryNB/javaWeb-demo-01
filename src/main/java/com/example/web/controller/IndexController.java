package com.example.web.controller;

import com.example.web.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

/**
 * @Author Nick
 * @Classname IndexController
 * @Date 2021/7/23 16:29
 * @Description
 */
@Controller
public class IndexController {
    /**
     * 登录页配置
     * @return
     */
    @GetMapping(value = {"/","index","login"})
    public String loginPage(){
        return "login";
    }

    @PostMapping("/login")
    public String login(User user, HttpSession httpSession, Model model){

        if(StringUtils.hasLength(user.getUserName()) && "123456".equals(user.getPassWord())){
            //把登录成功的用户保存起来
            httpSession.setAttribute("loginUser",user);
            //登录成功后重定向到index.html界面，防止重复提交login界面表单
            return "redirect:index.html";
        }else {
            model.addAttribute("msg","账号或密码输入错误，请重新尝试！");
            return "login";
        }
    }

    /**
     * 主页
     * @return
     */
    @GetMapping("index.html")
    public String mainPage(HttpSession session,Model model){

        //是否登录      拦截器
//        Object loginUser = session.getAttribute("loginUser");
//        if(loginUser != null){
//            return "index";
//        }else {
//            //登录不成功，回到登录login界面
//            model.addAttribute("msg","请重新登录！");
//            return "login";
//        }
        return "index";
    }
}

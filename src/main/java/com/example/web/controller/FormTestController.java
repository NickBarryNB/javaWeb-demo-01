package com.example.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @Author Nick
 * @Classname FormTestController
 * @Date 2021/7/26 16:37
 * @Description
 */
@Controller
public class FormTestController {
    @GetMapping("/form_layouts.html")
    public String form_layout(){
        return "/form/form_layouts";
    }

    /**
     * 自动封装上传过来的文件
     * @param email
     * @param userName
     * @param headImage
     * @param photos
     * @return
     */
    @PostMapping("/upload")
    public String upload(@RequestParam("email") String email,
                         @RequestParam("userName") String userName,
                         @RequestPart("headImage") MultipartFile headImage,
                         @RequestPart("photos") MultipartFile[] photos) throws IOException {

        if(!headImage.isEmpty()){

            //保存到文件服务器，此处是本地路径
            String originalFilename = headImage.getOriginalFilename();
            headImage.transferTo(new File("D:\\WorkSpace\\Java\\rubbishs\\image\\" + originalFilename));
        }

        if(photos.length > 0){
            //多文件保存到文件服务器，此出处也是本地路径
            for (MultipartFile photo : photos) {
                String originalFilename = photo.getOriginalFilename();
                photo.transferTo(new File("D:\\WorkSpace\\Java\\rubbishs\\images\\" + originalFilename));
            }
        }
        return "index";
    }
}

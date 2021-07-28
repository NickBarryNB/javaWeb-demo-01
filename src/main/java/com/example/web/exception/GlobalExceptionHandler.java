package com.example.web.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Author Nick
 * @Classname GlobalExceptionHandler
 * @Date 2021/7/28 10:50
 * @Description 处理整个web controller的异常  公司常用  此处当url中？aabb=xxx的访问错误时就会跳转回login
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler{

    @ExceptionHandler({ArithmeticException.class,NullPointerException.class})//处理异常
    public String handleArithException(Exception e){

        log.error("捕捉到的异常是{}",e);//打印异常信息
        return "login";//捕捉到异常就会跳转回登陆页面
    }
}

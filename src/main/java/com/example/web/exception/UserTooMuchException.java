package com.example.web.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @Author Nick
 * @Classname UserTooMuch
 * @Date 2021/7/28 11:31
 * @Description
 */
@ResponseStatus(value = HttpStatus.FORBIDDEN,reason = "用户数量太多了")
public class UserTooMuchException extends RuntimeException{
    public UserTooMuchException(){
    }
    public UserTooMuchException(String message){
        super(message);
    }
}

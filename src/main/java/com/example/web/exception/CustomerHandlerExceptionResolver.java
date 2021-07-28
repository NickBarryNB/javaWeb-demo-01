package com.example.web.exception;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author Nick
 * @Classname CustomerHandlerExceptionResolver
 * @Date 2021/7/28 14:57
 * @Description 访问basic_table会报511错误     且优先级高
 */
@Order(value = Ordered.HIGHEST_PRECEDENCE)      //设定为高优先级（数字越小越优先）
@Component
public class CustomerHandlerExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request,
                                         HttpServletResponse response,
                                         Object handler,
                                         Exception ex){
        try {
            response.sendError(511,"就想发这个错误");
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ModelAndView();
    }
}

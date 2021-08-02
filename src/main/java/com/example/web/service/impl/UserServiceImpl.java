package com.example.web.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.web.bean.User;
import com.example.web.mapper.UserMapper;
import com.example.web.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author Nick
 * @Classname UserServiceImpl
 * @Date 2021/8/2 10:22
 * @Description
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}

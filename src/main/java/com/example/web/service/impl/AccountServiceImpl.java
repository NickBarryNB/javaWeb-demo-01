package com.example.web.service.impl;

import com.example.web.bean.Account;
import com.example.web.mapper.AccountMapper;
import com.example.web.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author Nick
 * @Classname AccountService
 * @Date 2021/7/30 15:12
 * @Description
 */
@Service    //表示业务逻辑组件
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountMapper accountMapper;

    public Account getId(Integer id){
        return accountMapper.getById(id);
    }
}

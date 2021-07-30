package com.example.web.mapper;

import com.example.web.bean.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Author Nick
 * @Classname AccountMapper
 * @Date 2021/7/30 15:02
 * @Description
 */
//@Mapper
public interface AccountMapper {
    @Select("select * from user where id = #{id}")
    public Account getById(Integer id);
}

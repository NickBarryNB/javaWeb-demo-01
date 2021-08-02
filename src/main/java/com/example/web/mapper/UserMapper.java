package com.example.web.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.web.bean.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author Nick
 * @Classname UserMapper
 * @Date 2021/7/30 16:42
 * @Description
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}

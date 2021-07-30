package com.example.web.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Nick
 * @Classname User
 * @Date 2021/7/23 17:21
 * @Description
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    @TableField(exist = false)  //表示当前表中该属性不存在
    private String userName;
    @TableField(exist = false)  //表示当前表中该属性不存在
    private String passWord;


    //以下是数据库字段
    private Long id;
    private String name;
    private Integer age;
    private String email;
}

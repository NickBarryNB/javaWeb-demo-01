package com.example.web;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@Slf4j
@SpringBootTest
class WebDemo01ApplicationTests {

//    自动注入
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    void contextLoads() {
//        jdbcTemplate.queryForList("select * from user ");
//        查询到test表中只有一个属性test，且只有一个值为123，返回给long类型的along变量并日志输出
        long along = jdbcTemplate.queryForObject("SELECT * FROM test",long.class);
        log.info("查询到的长度   {}",along);
    }

}

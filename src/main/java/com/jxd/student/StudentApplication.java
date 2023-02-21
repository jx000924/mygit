package com.jxd.student;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName StudentApplication
 * @Description TODO
 * @Author zhangchenyang
 * @Date 2023/2/21
 * @Version 1.0
 */

@SpringBootApplication
@MapperScan("com.jxd.student.dao")
public class StudentApplication {
    public static void main(String[] args) {
        SpringApplication.run(StudentApplication.class);
    }
}

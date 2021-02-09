package com.xsqwe.admin;

import com.xsqwe.admin.mapper.StudentMapper;
import com.xsqwe.admin.pojo.Student;
import com.xsqwe.admin.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootTest
@Slf4j
class AdminApplicationTests {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private DataSource dataSource;

    @Autowired
    private StudentMapper studentMapper;

    @Test
    void contextLoads() {
        Long aLong = jdbcTemplate.queryForObject("select count(*) from ep_core_user ", Long.class);
        log.info("总记录数: {} ", aLong);
        log.info("数据源类型: {}", dataSource.getClass());
    }

    @Test
    void testUserMapper() {
        Student student = studentMapper.selectById("1");
        Student student1 = new Student();
        student1.setAddress("皇宫");
        student1.setStuName("王昭君");
        int insert = studentMapper.insert(student1);
        System.out.println("插入的行数"+insert);
        System.out.println(studentMapper.selectStudentByStuId("1"));
        log.info("student  的信息: {}", student);
    }
}

package com.xsqwe.admin.controller;

import com.xsqwe.admin.pojo.Employee;
import com.xsqwe.admin.pojo.Student;
import com.xsqwe.admin.service.StudentService;
import com.xsqwe.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description: todo
 * @author: gaojiabao
 * @date: 2021/2/6 23:20
 */
@Controller
public class TestController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private UserService userService;

    @Autowired
    private StudentService studentService;

    @ResponseBody
    @GetMapping("/sql")
    public String queryData() {
        Long aLong = jdbcTemplate.queryForObject("select count(1) from ep_core_user", Long.class);
        return aLong.toString();
    }

    @GetMapping("/getEmp")
    @ResponseBody
    public Employee queryData(Integer id) {
        Employee emp = userService.getEmp(id);
        return emp;
    }


    @GetMapping("/getStudent")
    @ResponseBody
    public Student queryStudent(String stuId) {
        Student student = studentService.getStudentByStuId(stuId);
        return student;
    }

    @PostMapping("/addStudent")
    @ResponseBody
    public Student addStudent(Student student) {
        studentService.addStudent(student);
        return student;
    }
}

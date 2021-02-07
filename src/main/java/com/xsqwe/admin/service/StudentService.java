package com.xsqwe.admin.service;

import com.xsqwe.admin.mapper.StudentMapper;
import com.xsqwe.admin.pojo.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: todo
 * @author: gaojiabao
 * @date: 2021/2/7 20:23
 */
@Service
@Slf4j
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;

    public Student getStudentByStuId(String stuId){
        Student student = studentMapper.selectStudentByStuId(stuId);
        log.info("student 信息:{}",student);
        return student;
    }

    public void addStudent(Student student) {
        studentMapper.insertStu(student);
    }
}

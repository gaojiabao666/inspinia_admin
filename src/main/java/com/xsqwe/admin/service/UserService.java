package com.xsqwe.admin.service;

import com.xsqwe.admin.mapper.EpCoreUserMapper;
import com.xsqwe.admin.pojo.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: todo
 * @author: gaojiabao
 * @date: 2021/2/7 18:57
 */
@Service
@Slf4j
public class UserService {

    @Autowired
    private EpCoreUserMapper userMapper;

    public Employee getEmp(Integer id) {
        Employee employee = userMapper.getEmployeeById(id);
        log.info("employee 信息: {}", employee);
        return employee;
    }
}

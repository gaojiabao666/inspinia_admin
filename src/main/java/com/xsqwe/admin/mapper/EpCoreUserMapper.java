package com.xsqwe.admin.mapper;

import com.xsqwe.admin.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @description: todo
 * @author: gaojiabao
 * @date: 2021/2/7 17:46
 */
@Mapper
public interface EpCoreUserMapper {

    Employee getEmployeeById(Integer id);
}

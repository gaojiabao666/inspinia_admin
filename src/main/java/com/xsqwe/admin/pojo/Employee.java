package com.xsqwe.admin.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @description: todo
 * @author: gaojiabao
 * @date: 2021/2/7 17:51
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Integer employeeId;
    private String name;
    private String gender;
    private Integer salary;
    private String username;
    private String password;
}

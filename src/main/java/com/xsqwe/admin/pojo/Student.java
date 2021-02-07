package com.xsqwe.admin.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @description: todo
 * @author: gaojiabao
 * @date: 2021/2/7 19:41
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String stuId;
    private String stuName;
    private String address;
}

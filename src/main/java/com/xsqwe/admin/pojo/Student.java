package com.xsqwe.admin.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("student")
public class Student {
    /**
     * 所有的属性都应该在数据库中存在, 否则会报错
     * 加上 @TableField(exist = false) 代表这个属性在表中不存在, 就不会报错了
     */
    @TableField(exist = false)
    private String password;

    private String stuId;
    private String stu_id;
    private String stuName;
    private String address;
}

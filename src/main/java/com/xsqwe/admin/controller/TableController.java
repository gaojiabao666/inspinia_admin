package com.xsqwe.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @description: 表格Controller, 返回对应的表格
 * @author: gaojiabao
 * @date: 2021/2/6 14:38
 */
@Controller
public class TableController {
    @GetMapping("/table")
    public String table(){
        return "table/table.html";
    }
}

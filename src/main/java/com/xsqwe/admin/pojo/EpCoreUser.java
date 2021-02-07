package com.xsqwe.admin.pojo;

import lombok.Data;
import lombok.ToString;

/**
 * @description: 用户信息表 ep_core_user
 * @author: gaojiabao
 * @date: 2021/2/4 13:51
 */
@Data
@ToString
public class EpCoreUser {
    private String userName;
    private String loginPassword;
}

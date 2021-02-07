package com.xsqwe.admin.controller;

import com.xsqwe.admin.pojo.EpCoreUser;
import com.xsqwe.admin.utils.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

/**
 * @description: todo
 * @author: gaojiabao
 * @date: 2021/2/4 13:45
 */
@Controller
public class LoginController {

    @GetMapping(value = {"login", "/"})
    public String page(){
        return "login";
    }
    /**
     * @param user    登录用户
     * @param session
     * @param model
     * @description: 登录逻辑
     * @return: java.lang.String
     * @author: gaojiabao
     * @date: 2021/2/4
     */
    @PostMapping("/login")
    public String login(EpCoreUser user, HttpSession session, Model model) {
        String loginPassWord = user.getLoginPassword();
        String userName = user.getUserName();
        if (StringUtils.isNotEmpty(userName) && StringUtils.isNotEmpty(loginPassWord)
                && "1234".equals(loginPassWord)) {
            //存儲登录成功用户
            session.setAttribute("loginUser", user);
            //重定向到index.html , 避免重复提交表单
            return "redirect:/index.html";
        }else{
            model.addAttribute("msg", "帐号或密码错误");
            // 返回login 页面
            return "login";
        }
    }

    @GetMapping("index.html")
    public String index(HttpSession session, Model model) {
        Object loginUser = session.getAttribute("loginUser");
        // 判断是否登录状态
        if (loginUser == null) {
            model.addAttribute("msg", "清重新登录");
            return "login";
        }
        return "index";
    }


}

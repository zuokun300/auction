package com.itzk.auction.controller;

import com.itzk.auction.model.User;
import com.itzk.auction.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginRegisterController {
    @Autowired
    UserService userService;
    @PostMapping("doLogin")
    public String doLogin(@Param(value = "uName")String uName,
                          @Param(value = "uPass")String uPass,
                          HttpServletRequest request,
                          Model model){

        User user = userService.doLogin(uName,uPass);
        if (user != null ){
            request.getSession().setAttribute("user",user);
        }else{
            System.out.println("用户名或密码错误");
            model.addAttribute("loginMessage","用户名或密码错误");
            return "login";
        }
        return "redirect:/";
    }

    @PostMapping("doRegister")
    public String doRegister(@RequestParam("uName")String uName,
                             @RequestParam("uPass")String uPass,
                             @RequestParam("uGender")String uGender,
                             @RequestParam("uPhone")String uPhone){

        return "/";
    }
}

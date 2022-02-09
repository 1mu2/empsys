package com.lanqiao.empsys.controller;

import com.lanqiao.empsys.model.Users;
import com.lanqiao.empsys.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@Slf4j
// @RequestMapping //springboot 针对多种请求方式提供了相应的注解：@GetMapping, @PostMapping, @PutMapping, @DeleteMapping
// RESTful api 风格的开发模式
public class UserController {

    @Autowired
    IUserService userService;

    @GetMapping("/")
    public String index() {
        return "login";
    }

    @PostMapping("/user/login")
    public String loginUser(Users user) {
        Users logUser = this.userService.selectForLogin(user);

        log.debug("" + logUser);

        if (logUser != null) { //success
            return "redirect:/employees"; // employee/list.html
        }
        return "redirect:/";
    }

}

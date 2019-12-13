package com.qingfeng.springboot_demo.controller;

import com.qingfeng.springboot_demo.prop.entity.User;
import com.qingfeng.springboot_demo.service.UserService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: Spring-boot-demo
 * @description: 用户Controller
 * @author: QingFeng
 * @create: 2019-12-13 14:58
 **/
@RestController
@RequestMapping("api/v1")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("users")
    public List<User> getUsers() {
        return userService.GetUser();
    }
}

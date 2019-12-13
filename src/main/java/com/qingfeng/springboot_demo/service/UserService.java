package com.qingfeng.springboot_demo.service;

/**
 * service 层注意事项
 * 1.@Service 注解
 * 2.自动注入持久层
 * 3.功能实现代码
 */

import com.qingfeng.springboot_demo.prop.entity.User;
import com.qingfeng.springboot_demo.repository.UserRepository;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @program: Spring-boot-demo
 * @description: 用户Service
 * @author: QingFeng
 * @create: 2019-12-13 14:54
 **/
@Service
public class UserService {

    @Resource
    private UserRepository userRepository;

    public List<User> GetUser() {
        List<User> users = userRepository.findAll();
        return users;
    }
}

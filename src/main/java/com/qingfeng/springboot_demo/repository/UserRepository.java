package com.qingfeng.springboot_demo.repository;

import com.qingfeng.springboot_demo.prop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: Spring-boot-demo
 * @description: 用户
 * @author: QingFeng
 * @create: 2019-12-13 14:53
 **/
public interface UserRepository extends JpaRepository<User,Integer> {
}

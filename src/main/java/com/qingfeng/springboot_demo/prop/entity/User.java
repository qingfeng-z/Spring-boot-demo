package com.qingfeng.springboot_demo.prop.entity;

import com.qingfeng.springboot_demo.prop.enums.Role;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;
/**
 * @program: Spring-boot-demo
 * @description: 用户
 * @author: QingFeng
 * @create: 2019-12-13 14:33
 **/
@Table(name = "T_USER")
@Entity
@Data
public class User extends BaseEntity{
private String name;
private String phoneNumber;
private boolean enabled;
private Role role;
}

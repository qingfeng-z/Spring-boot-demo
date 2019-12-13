package com.qingfeng.springboot_demo.prop.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

/**
 * @program: Spring-boot-demo
 * @description: 基类
 * @author: QingFeng
 * @create: 2019-12-13 14:36
 **/
@MappedSuperclass
@Data
public class BaseEntity {
    @Id
    @GeneratedValue
    private Long id;
    @CreatedDate
    @Column(name = "create_time")
    private Date createTime;
    @Column(name = "create_by")
    @CreatedBy
    private Long createBy;
    @LastModifiedDate
    @Column(name = "modify_time")
    private Date modifyTime;
    @LastModifiedBy
    @Column(name = "modify_by")
    private Long modifyBy;
}

package com.example.user.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author： ygl
 * @date： 2018/3/26
 * @Description：
 */
@Data
@Table(name="sys_user")
public class SysUser{

    @Column(name ="id")
    private String id;

    @Column(name ="username")
    private String username;

    @Column(name ="password")
    private String password;

}

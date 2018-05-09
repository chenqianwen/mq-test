package com.example.user.service;

import com.example.user.entity.SysUser;

/**
 * @author： ygl
 * @date： 2018/5/9-17:52
 * @Description：
 */
public interface SysUserService {
    SysUser findOne(String id);
}

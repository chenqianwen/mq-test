package com.example.user.controller;


import com.example.user.entity.SysUser;
import com.example.user.mapper.SysUserMapper;
import com.example.user.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author： ygl
 * @date： 2018/3/21
 * @Description：
 */
@RestController
@RequestMapping("sys/user")
@Slf4j
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @GetMapping("/{id}")
    public SysUser findOne(@PathVariable String id) throws InterruptedException {
        SysUser model = sysUserService.findOne(id);
        log.info(model.toString());
        return model;
    }

}

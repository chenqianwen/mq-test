package com.example.user.service;

import com.example.user.entity.SysUser;
import com.example.user.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author： ygl
 * @date： 2018/5/9-17:53
 * @Description：
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Transactional
    @Override
    public SysUser findOne(String id) {
        SysUser one = sysUserMapper.findOne(id);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return one;
    }
}

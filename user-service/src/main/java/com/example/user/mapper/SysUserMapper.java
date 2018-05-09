package com.example.user.mapper;


import com.example.user.entity.SysUser;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * @author： ygl
 * @date： 2018/3/20
 * @Description：
 */
public interface SysUserMapper {

    @Select("SELECT * FROM sys_user WHERE id = #{id}")
    SysUser findOne(String id);

}
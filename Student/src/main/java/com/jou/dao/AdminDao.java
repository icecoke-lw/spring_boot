package com.jou.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jou.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface AdminDao extends BaseMapper<com.jou.pojo.Admin> {
    @Select("select * from admin where username=#{username} and password=#{password }")
    Admin login(String username, String password);
}

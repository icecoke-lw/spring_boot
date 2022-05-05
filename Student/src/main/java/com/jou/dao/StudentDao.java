package com.jou.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jou.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StudentDao extends BaseMapper<Student> {
    @Select("select * from student where id=#{id}")
    Student getById(Integer id);
}

package com.jou.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jou.pojo.Student;


public interface IStudentService extends IService<Student> {

        Boolean modify(Student student);
        Boolean delete(Integer id);
        Boolean saveStu(Student student);
        Student getById(Integer id);
        IPage<Student> getPage(int currentPage, int pageSize);
        IPage<Student> getPage(int currentPage, int pageSize, Student student);
}

package com.jou.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jou.dao.StudentDao;
import com.jou.pojo.Student;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentDao, Student> implements IStudentService {
    @Autowired
    private StudentDao studentDao;
    @Override
    public Boolean modify(Student student) {
        return studentDao.updateById(student)>0;
    }

    @Override
    public Boolean delete(Integer id) {
        return studentDao.deleteById(id)>0;
    }

    @Override
    public Boolean saveStu(Student student) {
        return studentDao.insert(student)>0;
    }

    @Override
    public Student getById(Integer id) {

        return studentDao.getById(id);
    }

    @Override
    public IPage<Student> getPage(int currentPage, int pageSize) {
        IPage page=new Page(currentPage,pageSize);
        studentDao.selectPage(page,null);
        return page;
    }

    @Override
    public IPage<Student> getPage(int currentPage, int pageSize, Student student) {
        LambdaQueryWrapper<Student> lqw=new LambdaQueryWrapper<Student>();

        lqw.like(Strings.isNotEmpty(student.getName()),Student::getName,student.getName());
        lqw.like(Strings.isNotEmpty(student.getPlace()),Student::getPlace,student.getPlace());
        IPage page=new Page(currentPage,pageSize);
        studentDao.selectPage(page,lqw);
        return page;
    }
}

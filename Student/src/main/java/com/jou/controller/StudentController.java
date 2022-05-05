package com.jou.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jou.controller.utils.R;
import com.jou.pojo.Student;
import com.jou.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@CrossOrigin
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private IStudentService studentService;
    @GetMapping
    public R getall(){
        return new R(true,studentService.list());}
    @PostMapping
    public R saveStu(@RequestBody Student student){

        Boolean flag = studentService.saveStu(student);

        return new R(flag,flag ? "添加成功":"添加失败");}
    @PutMapping
    public R update(@RequestBody Student student){
        return new R(studentService.modify(student));}
    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id){return new R(studentService.delete(id));}
    @GetMapping("{id}")
    public R getByName(@PathVariable Integer id){return new R(true,studentService.getById(id));}
//    @GetMapping("{currentPage}/{pageSize}")
//    public R getPage(@PathVariable int currentPage,@PathVariable int pageSize){
//        IPage<Student> page = studentService.getPage(currentPage, pageSize);
//        if(currentPage >page.getPages()){
//            page=studentService.getPage((int)page.getPages(),pageSize);
//        }
//
//        return new R(true,page);}
@GetMapping("{currentPage}/{pageSize}")
public R getPage(@PathVariable int currentPage,@PathVariable int pageSize,Student student){
    System.out.println("参数==》"+student);
    IPage<Student> page = studentService.getPage(currentPage, pageSize,student);
    if(currentPage >page.getPages()){
        page=studentService.getPage((int)page.getPages(),pageSize,student);
    }

    return new R(true,page);}



}

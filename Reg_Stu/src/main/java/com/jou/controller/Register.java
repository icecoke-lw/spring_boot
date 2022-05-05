package com.jou.controller;

import com.jou.pojo.Student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("student")
public class Register {

   @RequestMapping("register")
   public ModelAndView register(HttpServletRequest request, Student student){
       String ip=request.getRemoteAddr();
    ModelAndView mv=new ModelAndView();
    mv.addObject("stu",student);
    mv.setViewName("resucc");
    mv.addObject("ip",ip);
       return mv;
   }
}

package com.jou.controller;


import com.jou.controller.utils.R;
import com.jou.dao.AdminDao;
import com.jou.pojo.Admin;

import com.jou.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/login")
public class LoginController {
    @Autowired
   private LoginService loginService;
    @GetMapping("{username}/{password}")
    public R  login(@PathVariable String username,@PathVariable String password ){
    Boolean flag=false;
    String msg;
    Admin admin1=loginService.login(username,password);
    if (admin1!=null){
        msg="登录成功";
      flag=true;
    }else{
        msg="用户名或密码错误！";
    }
    return new R(flag,admin1,msg);
}


}

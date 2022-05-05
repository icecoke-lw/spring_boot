package com.jou.service;

import com.jou.dao.AdminDao;
import com.jou.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService{
    @Autowired

    private AdminDao adminDao;

    @Override
    public Admin login(String username, String password) {
        return adminDao.login(username,password);
    }
}

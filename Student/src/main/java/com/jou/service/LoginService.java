package com.jou.service;

import com.jou.pojo.Admin;

public interface LoginService {
    Admin login(String username, String password);
}

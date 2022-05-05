package com.jou.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jou")
public class Show {
    public String show(){
        return "hello 江苏海洋大学";
    }
}

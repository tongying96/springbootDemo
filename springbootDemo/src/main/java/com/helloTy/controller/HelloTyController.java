package com.helloTy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloTyController {

    @Value("${me}")
    private String msg;

    @RequestMapping("/index")
    public String showMsg() {
        return msg;
    }
}

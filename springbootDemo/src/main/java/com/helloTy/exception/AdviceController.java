package com.helloTy.exception;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 自定义返回数据类
 */
@RestControllerAdvice
public class AdviceController {



    @ExceptionHandler(value = java.lang.Exception.class)
    public Map advice(HelloException ex){
        Map<String,Object> map = new HashMap<>();
        map.put("code",500);
        map.put("message",ex.getMessage());
        return map;
    }

    @ExceptionHandler(value = java.lang.NullPointerException.class)
    public Map advice1(HelloException ex){
        Map<String,Object> map = new HashMap<>();
        map.put("code",200);
        map.put("message",ex.getMessage());
        return map;
    }
}

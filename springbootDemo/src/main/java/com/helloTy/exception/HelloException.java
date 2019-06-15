package com.helloTy.exception;


/*
异常类
 */

public class HelloException extends Exception{

    public HelloException() {
    }

    public HelloException(String message, Throwable cause) {
        super(message, cause);
    }

    public HelloException(String message) {
        super(message);
    }
}

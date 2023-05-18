package com.masterspring.masterspring.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;


public class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }
}

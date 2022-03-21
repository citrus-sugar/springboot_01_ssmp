package com.itheima.controller.utils;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @ClassName ProjectExceptionAdvice
 * @Description
 * @Author citrus_sugar
 * @Date 2022/3/21 15:45
 */
//@ControllerAdvice
@RestControllerAdvice
public class ProjectExceptionAdvice {

    @ExceptionHandler
    public R doException(Exception ex) {
        ex.printStackTrace();
        return new R(false, "服务器故障，请稍后再试！");
    }
}

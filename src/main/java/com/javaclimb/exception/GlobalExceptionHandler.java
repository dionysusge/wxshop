package com.javaclimb.exception;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import com.javaclimb.common.Result;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/*
* 全局异常拦截
* */

@ControllerAdvice(basePackages = "com.javaclimb.controller")
public class GlobalExceptionHandler {

    private static final Log log = LogFactory.get();

    /* 统一异常处理，主要用于Exception */
    @ExceptionHandler(Exception.class)
    @ResponseBody   // 返回json串
    public Result error(HttpServletRequest request, Exception e) {
        log.error("异常信息", e);
        return Result.error();
    }

    @ExceptionHandler(CustomException.class) // 两个抛出异常，会检查参数，如果符合的是自定义的异常，会是下面这个函数
    @ResponseBody
    public Result customError(HttpServletRequest request, CustomException e){
        return Result.error(e.getCode(), e.getMessage());
    }
}

package com.javaclimb.common;
/*
* 统一返回码
* */
public enum ResultCode {
    SUCCESS("0", "成功"),
    ERROR("-1", "系统异常"),
    PARAM_ERROR("1001", "参数异常"),
    USER_EXIST_ERROR("2001", "用户已存在"),
    USER_ACCOUNT_ERROR("2002", "账户或密码错误"),
    USER_NOT_EXIST_ERROR("2003", "用户不存在"),
    USER_PASSWORD_ERROR("2004", "密码错误");


    public String code;
    public String msg;

    ResultCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}

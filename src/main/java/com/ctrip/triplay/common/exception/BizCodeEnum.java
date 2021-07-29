package com.ctrip.triplay.common.exception;


public enum BizCodeEnum {
    /**
     * 用户相关
     */
    EMAIL_PWD_ERROR(1001,"登录邮箱或密码错误"),
    /**
     * 服务器
     */
    EXCEPTION(4000, "服务器错误");


    private int code;
    private String msg;

    BizCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}

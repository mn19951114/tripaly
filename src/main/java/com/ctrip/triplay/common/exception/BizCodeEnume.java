package com.ctrip.triplay.common.exception;

public enum BizCodeEnume {
    EXCEPTION(40000, "服务器错误");
    private int code;
    private String msg;

    BizCodeEnume(int code, String msg) {
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

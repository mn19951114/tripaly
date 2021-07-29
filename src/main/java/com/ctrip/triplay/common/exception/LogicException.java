package com.ctrip.triplay.common.exception;

public class LogicException extends RuntimeException {
    private String msg;
    private int code;

    public LogicException(int code, String msg) {
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}

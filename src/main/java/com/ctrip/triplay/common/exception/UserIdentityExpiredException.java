package com.ctrip.triplay.common.exception;

import lombok.Data;

@Data
public class UserIdentityExpiredException extends RuntimeException {
    private String msg;
    private int code;

    public UserIdentityExpiredException() {
        this.msg = "用户身份过期";
        this.code = 505;
    }
}

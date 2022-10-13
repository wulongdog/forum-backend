package com.fwf_bbs.forumcommon.exception;

import com.fwf_bbs.forumcommon.api.IErrorCode;

/**
 * @className ApiException
 * @description 自定义api异常
 * @auther wulongdog
 * @date 2022/10/3  19:36
 */
public class ApiException extends RuntimeException{

    private IErrorCode errorCode;

    public ApiException(IErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ApiException(String message) {
        super(message);
    }


    public ApiException(Throwable cause) {
        super(cause);
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public IErrorCode getErrorCode() {
        return errorCode;
    }
}

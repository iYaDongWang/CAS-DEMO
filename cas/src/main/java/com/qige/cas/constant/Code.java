package com.qige.cas.constant;

/**
 *  全局状态码
 *
 * @author 王亚东
 * @date 2020/3/25 22:47
 */
public enum Code {
    /**
     *  全部状态码
     */
    SUCCESS(10000,"操作成功");

    /**
     *  操作码
     */
    int code;

    /**
     *  提示信息
     */
    String message;

    Code(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

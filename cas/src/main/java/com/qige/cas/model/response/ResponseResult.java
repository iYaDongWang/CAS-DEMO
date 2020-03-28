package com.qige.cas.model.response;

import com.qige.cas.constant.Code;

import java.io.Serializable;

/**
 * @author 王亚东
 * @date 2020/3/25 22:37
 */

public class ResponseResult<T> implements Serializable {
    /**
     *  响应码
     */
    private Integer code;

    /**
     *  响应信息
     */
    private String message;

    /**
     *  具体数据
     */
    private T data;

    public ResponseResult(Code code, T data) {
        this.code = code.getCode();
        this.message = code.getMessage();
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

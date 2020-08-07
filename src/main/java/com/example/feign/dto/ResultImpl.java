package com.example.feign.dto;

/**
 * 通用返回对象
 * Created by chenza on 2019/4/19.
 */
public class ResultImpl<T> {
    private long code;
    private String message;
    private T data;

    protected ResultImpl() {
    }

    protected ResultImpl(long code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
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

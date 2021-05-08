package com.inspur.springbootproject.vo;

import com.inspur.springbootproject.enums.HttpStatusEnum;

public class ResponseVo<T> {
    private Meta meta;
    private T data;
    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ResponseVo<T> build(T data, String message, HttpStatusEnum httpStatusEnum){
        return build(data,message,httpStatusEnum.code());
    }
    public ResponseVo<T> build(T data, String message, String code){
        meta = new Meta();
        this.setData(data);
        this.meta.setMessage(message);
        this.meta.setCode(code);
        return this;
    }
}

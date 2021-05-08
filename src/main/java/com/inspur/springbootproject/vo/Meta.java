package com.inspur.springbootproject.vo;

public class Meta {
    private String code;

    public String getMessage() {
        return message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Meta{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    private String message;
}

package com.ldx.springcloud.base.config.vo;


public class ResultModel {

    private String resultCode;

    private String message;

    private Object result;

    public ResultModel() {
        this.resultCode = "1";
        this.message = "success";
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}


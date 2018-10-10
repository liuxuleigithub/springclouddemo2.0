package com.demo.consumerser.utils;

public class ResponseObject {
    private Integer Status;//返回状态码
    private Object Content;//返回数据
    private String Message;//状态对应的内容

    public ResponseObject(Integer status, Object content, String message) {
        Status = status;
        Content = content;
        Message = message;
    }

    public ResponseObject() {
    }

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer status) {
        Status = status;
    }

    public Object getContent() {
        return Content;
    }

    public void setContent(Object content) {
        Content = content;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}

package com.demo.productorser.bean;

public class UserMessage {


    private String message;

    private String id;

    private String type;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UserMessage(String message, String id, String type) {
        this.message = message;
        this.id = id;
        this.type = type;
    }
}

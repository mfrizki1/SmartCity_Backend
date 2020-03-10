package com.example.jdbc.model;

import org.springframework.lang.Nullable;

public class HttpResponModel<T> {


    private String message;
    private T data;
    private int status;

    @Override
    public String toString() {
        return "HttpResponModel{" +
                "message='" + message + '\'' +
                ", data=" + data +
                ", status=" + status +
                '}';
    }

    public HttpResponModel(){}
    public HttpResponModel(int status,T data,String message){
        this.status = status;
        this.data = data;
        this.message = message;
    }

    public HttpResponModel(@Nullable T data )
    {this(200,data,"sukses");}
    public static <T> HttpResponModel<T> ok(@Nullable T data)
    {return new HttpResponModel(200,data,"success");}

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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

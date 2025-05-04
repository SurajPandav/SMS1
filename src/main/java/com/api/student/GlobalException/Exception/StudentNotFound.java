package com.api.student.GlobalException.Exception;

public class StudentNotFound extends RuntimeException{

    private String msg;

    public StudentNotFound(String msg) {
        super(msg);

    }
}

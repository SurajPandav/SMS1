package com.api.student.GlobalException;

import com.api.student.GlobalException.Exception.StudentNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(StudentNotFound.class)
    public ResponseEntity<String> usernotfound(StudentNotFound st){

        return new ResponseEntity<String>(st.getMessage(), HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler(NullPointerException.class)
    public NullPointerException nullpointer(){
        System.out.println("hello");
         return new NullPointerException();

    }
}

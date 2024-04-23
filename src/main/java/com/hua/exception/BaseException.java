package com.hua.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

public class BaseException extends RuntimeException{

    String msg;

    public BaseException(String msg){
        this.msg = msg;
    }
}

package com.xworkz.libapp.Exception;

import java.util.logging.ErrorManager;

public class GetAuthorByBookException extends RuntimeException{
    public GetAuthorByBookException(String ErrorMessage){
        super(ErrorMessage);
    }
}

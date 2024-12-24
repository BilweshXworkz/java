package com.xworkz.libapp.Exception;

public class GetAuthorByIdException extends RuntimeException{
    public GetAuthorByIdException(String errorMessage){
        super(errorMessage);
    }
}

package br.com.itcode.myfood.register.validation.errors;

public class ApiRuntimeError extends RuntimeException{

    public ApiRuntimeError(String message) {
        super(message);
    }
}

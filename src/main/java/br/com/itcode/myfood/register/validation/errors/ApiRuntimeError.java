package br.com.itcode.myfood.register.validation.errors;

import java.util.function.Supplier;

public class ApiRuntimeError extends RuntimeException {

    public ApiRuntimeError(String message) {
        super(message);
    }
}

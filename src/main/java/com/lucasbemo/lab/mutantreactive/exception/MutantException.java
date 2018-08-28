package com.lucasbemo.lab.mutantreactive.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author lucasbemo
 */
@ResponseStatus(value = HttpStatus.FORBIDDEN)
public class MutantException extends RuntimeException {

    public MutantException() {
        super();
    }
    public MutantException(String message, Throwable cause) {
        super(message, cause);
    }
    public MutantException(String message) {
        super(message);
    }
    public MutantException(Throwable cause) {
        super(cause);
    }
}
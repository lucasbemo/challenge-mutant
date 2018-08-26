package com.lucasbemo.lab.mutantreactive.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

/**
 * @author lucasbemo
 */
@ControllerAdvice
@RestController
public class CustomizedResponseExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(MutantException.class)
    public final ResponseEntity<MutantExceptionResponse> handleAllExceptions(Exception ex, WebRequest request) {
        MutantExceptionResponse exceptionResponse = new MutantExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));

        return new ResponseEntity<MutantExceptionResponse>(exceptionResponse, HttpStatus.FORBIDDEN);
    }

}
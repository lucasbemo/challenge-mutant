package com.lucasbemo.lab.mutantreactive.exception;

import java.util.Date;

/**
 * @author lucasbemo
 */
public class MutantExceptionResponse {
    private Date timestamp;
    private String message;
    private String details;

    public MutantExceptionResponse(Date timestamp, String message, String details) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}

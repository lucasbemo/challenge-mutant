package com.lucasbemo.lab.mutantreactive.entity;

import org.springframework.data.annotation.Id;

/**
 * @author lucasbemo
 */
public class VerificationEvent {

    @Id
    public String id;
    public boolean isMutant;

    public VerificationEvent() {}

    public VerificationEvent(boolean isMutant) {
        this.isMutant = isMutant;
    }
}

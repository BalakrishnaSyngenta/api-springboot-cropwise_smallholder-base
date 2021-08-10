package com.syngenta.cropwise.smallholder.exception;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class BusinessRuleException extends RuntimeException {

    private static final long serialVersionUID = -699134950520558547L;

    private final String errorMessage;

    @JsonIgnore
    private final HttpStatus httpStatus;

    public BusinessRuleException(String errorMessage, HttpStatus httpStatus) {
        this.errorMessage = errorMessage;
        this.httpStatus = httpStatus;
    }
}
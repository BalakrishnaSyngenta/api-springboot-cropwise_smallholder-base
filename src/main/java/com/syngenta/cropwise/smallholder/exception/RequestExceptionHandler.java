package com.syngenta.cropwise.smallholder.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestControllerAdvice
public class RequestExceptionHandler {

    @ExceptionHandler({ BusinessRuleException.class })
    public ResponseEntity<BusinessRuleException> businessRuleError(BusinessRuleException e) {

        log.error(e.getMessage());

        return ResponseEntity.status(e.getHttpStatus()).body(e);
    }
}
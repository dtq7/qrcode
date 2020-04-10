package com.etz.qrcode.advice;

import com.etz.qrcode.model.data.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.stream.Collectors;

/**
 * @author ajao temitayo
 */
@RestControllerAdvice
public class ApiAdvice {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ErrorResponse handleInvalidArguments(MethodArgumentNotValidException ex){
        return new ErrorResponse("99", String.format("The following arguments are invalid: %s",
                ex.getBindingResult().getFieldErrors()
                        .stream()
                        .map(FieldError::getField)
                        .collect(Collectors.joining(","))
        ));
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(DepartmentNotFoundException.class)
    public ErrorResponse handleDepartmentNotFound(DepartmentNotFoundException ex){
        return new ErrorResponse("10", ex.getMessage());
    }

    //Add other advice logic to catch specific exceptions
}

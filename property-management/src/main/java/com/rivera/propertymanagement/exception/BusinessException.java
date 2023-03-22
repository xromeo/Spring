package com.rivera.propertymanagement.exception;

import java.util.List;

/**
 * Created by Omar.Rivera on 20/3/23.
 *
 * @author Omar.Rivera
 */

public class BusinessException extends RuntimeException{
    private List<ErrorModel> errors;

    public BusinessException() {
    }

    public BusinessException(List<ErrorModel> errors) {
        this.errors = errors;
    }

    public List<ErrorModel> getErrors() {
        return errors;
    }

    public void setErrors(List<ErrorModel> errors) {
        this.errors = errors;
    }
}

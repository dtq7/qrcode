package com.etz.qrcode.advice;

/**
 * @author ajao temitayo
 */
public class DepartmentNotFoundException extends RuntimeException {
    public DepartmentNotFoundException() {
        super();
    }

    public DepartmentNotFoundException(String message) {
        super(message);
    }
}

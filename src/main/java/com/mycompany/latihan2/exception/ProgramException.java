package com.mycompany.latihan2.exception;

// Error handler untuk program ini
public class ProgramException extends Throwable {
    private String message;

    public ProgramException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

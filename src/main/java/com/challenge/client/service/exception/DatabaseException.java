package com.challenge.client.service.exception;

import java.io.Serializable;

public class DatabaseException extends RuntimeException {

    public DatabaseException(String msg) {
        super(msg);
    }

}

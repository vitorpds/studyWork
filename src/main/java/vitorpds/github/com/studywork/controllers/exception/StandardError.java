package vitorpds.github.com.studywork.controllers.exception;

import java.io.Serializable;

public class StandardError implements Serializable {
    private String error;
    private String message;

    public StandardError() {
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

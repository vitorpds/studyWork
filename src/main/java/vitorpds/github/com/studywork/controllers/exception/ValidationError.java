package vitorpds.github.com.studywork.controllers.exception;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {
    private final List<FieldError> listError = new ArrayList<>();

    public List<FieldError> getListError() {
        return listError;
    }

    public void addError(String fieldName, String message) {
        listError.add(new FieldError(fieldName, message));
    }
}

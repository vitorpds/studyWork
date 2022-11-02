package vitorpds.github.com.studywork.controllers.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ValidationError validError(MethodArgumentNotValidException e) {
        ValidationError err = new ValidationError();
        err.setError("Erro de validação");
        err.setMessage("Valore(s) inválido(s) para o(s) campo(s)");

        for (FieldError f: e.getBindingResult().getFieldErrors()) {
            err.addError(f.getField(), f.getDefaultMessage());
        }
        return err;
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public StandardError HttpMessageNotReadableException(HttpMessageNotReadableException e) {
        StandardError err = new StandardError();
        err.setError("Erro de preenchimento");
        err.setMessage("Json no formato inválido");
        return err;
    }
}

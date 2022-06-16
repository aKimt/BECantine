package iepscf.akimts.produit.exceptions;

import iepscf.akimts.exceptions.AbstractControllerAdvisor;
import iepscf.akimts.exceptions.BasicControllerExceptionHandler;
import iepscf.akimts.exceptions.models.ErrorDTO;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ControllerAdvisor extends AbstractControllerAdvisor {

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        ErrorDTO error = ErrorDTO.of(ex, MethodArgumentNotValidException.class);

        error.put("global", ex.getGlobalErrors());
        error.put("field", ex.getFieldErrors());

        return ResponseEntity.badRequest()
                .body(error);
    }
}

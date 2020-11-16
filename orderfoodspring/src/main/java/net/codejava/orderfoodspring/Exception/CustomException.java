package net.codejava.orderfoodspring.Exception;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import net.codejava.orderfoodspring.Doan.DoanException;

@ControllerAdvice
public class CustomException extends ResponseEntityExceptionHandler {
    @ExceptionHandler(DoanException.class)
    public static ResponseEntity<?> handleFoodNotFoundException(DoanException ex) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "Food not found");

        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
    }
}

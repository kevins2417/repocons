package edu.pe.uls.ucos.demojpa.cu.registrarpedido.exception;

import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GlobalExceptionHandler { 
	
    @ExceptionHandler(StockInsuficienteException.class)
    public ResponseEntity<String> manejarStockInsuficiente(
            StockInsuficienteException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> handleValidation(
            MethodArgumentNotValidException ex) {
        String message = ex.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(error -> error.getDefaultMessage())
                .collect(Collectors.joining(", "));
        return ResponseEntity.badRequest().body(message);
    }

    @ExceptionHandler(RuntimeException.class) 
	public ResponseEntity<String> manejarRuntimeException( 
		RuntimeException ex) { 
		return ResponseEntity .status(HttpStatus.INTERNAL_SERVER_ERROR) .body(ex.getMessage()); 
	}
}
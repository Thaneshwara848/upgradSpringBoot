package com.example.demo.exceptions;

import java.sql.SQLException;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobleExceptionHandler {

	 	@ExceptionHandler(EmployeenotFoundException.class)
	    public ResponseEntity<String> handleEmployeeNotFound(EmployeenotFoundException ex) {
	        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
	    }
	 // 🔹 2. Validation errors (Bean validation)
	    @ExceptionHandler(MethodArgumentNotValidException.class)
	    public ResponseEntity<String> handleValidationException(MethodArgumentNotValidException ex) {
	        String errorMessage = ex.getBindingResult().getFieldErrors()
	                .stream()
	                .map(err -> err.getField() + ": " + err.getDefaultMessage())
	                .findFirst()
	                .orElse("Validation failed!");
	        return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
	    }

	  

	    // 🔹 4. Database constraint violations
	    @ExceptionHandler(DataIntegrityViolationException.class)
	    public ResponseEntity<String> handleDataIntegrityViolation(DataIntegrityViolationException ex) {
	        return new ResponseEntity<>("Database error: Possible duplicate or constraint violation. " + ex.getMessage(),
	                HttpStatus.CONFLICT);
	    }

	    // 🔹 5. SQL exceptions
	    @ExceptionHandler(SQLException.class)
	    public ResponseEntity<String> handleSQLException(SQLException ex) {
	        return new ResponseEntity<>("SQL Error: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	    }

	    // 🔹 6. Null Pointer Exception
	    @ExceptionHandler(NullPointerException.class)
	    public ResponseEntity<String> handleNullPointer(NullPointerException ex) {
	        return new ResponseEntity<>("Null value encountered — please check your data!", HttpStatus.BAD_REQUEST);
	    }

	    // 🔹 7. Illegal Argument Exception
	    @ExceptionHandler(IllegalArgumentException.class)
	    public ResponseEntity<String> handleIllegalArgument(IllegalArgumentException ex) {
	        return new ResponseEntity<>("Invalid input: " + ex.getMessage(), HttpStatus.BAD_REQUEST);
	    }
	    @ExceptionHandler(Exception.class)
	    public ResponseEntity<String> handleGeneralException(Exception ex) {
	        return new ResponseEntity<>("Something went wrong: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	    }
}

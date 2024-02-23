package com.example.demo.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.demo.exception.ProductNotFoundException;

@ControllerAdvice
public class BuisinessErrorHandlerAdvice extends ResponseEntityExceptionHandler {
	
	
	@ExceptionHandler({ProductNotFoundException.class})
	public ResponseEntity<String> handleNotFound(ProductNotFoundException e){
		return new ResponseEntity<String>(e.getMessage(),HttpStatus.NOT_FOUND);
	}

}

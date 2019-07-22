package com.au.anz.accountdetails.controller;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.au.anz.accountdetails.dto.ErrorResponse;
import com.au.anz.accountdetails.exception.AccountNotFoundException;

@ControllerAdvice
@RestController
public class AccountExceptionController extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = AccountNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleUserNotFoundException(AccountNotFoundException ex,
			WebRequest webRequest) {
		ErrorResponse errorDetails = new ErrorResponse(LocalDate.now(), ex.getMessage(),
				webRequest.getDescription(false));
		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(RuntimeException.class)
	public final ResponseEntity<ErrorResponse> handleExceptions(RuntimeException ex, WebRequest webRequest) {
		ErrorResponse errorDetails = new ErrorResponse(LocalDate.now(), ex.getMessage(),
				webRequest.getDescription(false));
		return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
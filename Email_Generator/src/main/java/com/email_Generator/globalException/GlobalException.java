package com.email_Generator.globalException;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.email_Generator.exception.EmailNotSendException;
import com.email_Generator.exception.ErrorDetails;

@ControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(EmailNotSendException.class)
	public final ResponseEntity<?> handleEmailException(EmailNotSendException ex) {
		ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage());
		return new ResponseEntity<>(errorDetails,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}

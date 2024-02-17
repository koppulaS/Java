package com.TejaITB3.Springboot.Globalexception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GlobalExceptionhandler {
      
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Errordetails>globalexecption(Exception exception){
		Errordetails errdtls=new Errordetails(new Date(),exception.getMessage(),"user invalid....");
		return new ResponseEntity<Errordetails>(errdtls,HttpStatus.BAD_REQUEST);
		
	}
	@ExceptionHandler(UserNotAvailableException.class)
	public  ResponseEntity<Errordetails>userNotAvailableException(UserNotAvailableException exception){
		Errordetails errdtls=new Errordetails(new Date(),"USER NOT FOUND EXCEPTION", "user invalid....");
		return new ResponseEntity<Errordetails>(errdtls,HttpStatus.BAD_REQUEST);
	}
}

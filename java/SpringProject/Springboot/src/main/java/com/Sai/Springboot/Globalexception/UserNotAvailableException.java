package com.Sai.Springboot.Globalexception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.BAD_REQUEST)
public class UserNotAvailableException extends RuntimeException {
  
	private static final long serialVersionUID=1L;
	}


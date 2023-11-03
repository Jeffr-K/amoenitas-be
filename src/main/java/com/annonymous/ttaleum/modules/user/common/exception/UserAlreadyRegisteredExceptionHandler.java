package com.annonymous.ttaleum.modules.user.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class UserAlreadyRegisteredExceptionHandler {

  @ExceptionHandler(UserAlreadyRegisteredException.class)
  public final ResponseEntity<Object> handleUserAlreadyRegisteredException(UserAlreadyRegisteredException ex) {
    UserAlreadyExceptionEntity exceptionResponse = new UserAlreadyExceptionEntity();
    return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
  }
}

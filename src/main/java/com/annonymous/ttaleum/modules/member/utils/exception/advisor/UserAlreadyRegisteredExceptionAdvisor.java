package com.annonymous.ttaleum.modules.member.utils.exception.advisor;

import com.annonymous.ttaleum.modules.member.utils.exception.exception.UserAlreadyRegisteredException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class UserAlreadyRegisteredExceptionAdvisor {

  @ResponseStatus(HttpStatus.BAD_REQUEST)
  @ExceptionHandler(UserAlreadyRegisteredException.class)
  protected Result<?> handleUserAlreadyRegisteredException(UserAlreadyRegisteredException exception) {
    log.error(exception.getMessage());
    return Result.failure(HttpStatus.BAD_REQUEST, "이미 존재하는 유저입니다.", null);
  }
}

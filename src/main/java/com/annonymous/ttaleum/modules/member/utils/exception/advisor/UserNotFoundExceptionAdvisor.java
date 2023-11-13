package com.annonymous.ttaleum.modules.member.utils.exception.advisor;

import com.annonymous.ttaleum.modules.member.utils.exception.exception.UserNotFoundException;
import com.annonymous.ttaleum.modules.member.utils.response.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class UserNotFoundExceptionAdvisor {

  @ResponseStatus(HttpStatus.NOT_FOUND)
  @ExceptionHandler(UserNotFoundException.class)
  protected Result<?> userNotFoundExceptionHandler(UserNotFoundException exception) {
    log.error(exception.getMessage());
    return Result.failure(HttpStatus.NOT_FOUND, "유저를 찾을 수 없습니다.", null);
  }
}

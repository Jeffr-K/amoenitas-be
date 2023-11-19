package com.annonymous.amoenitas.modules.member.utils.exception.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public class UserNotFoundException extends RuntimeException {
  private final HttpStatus status;
  private final String message;
}

package com.annonymous.ttaleum.modules.member.utils.exception.exception;

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public class UserAlreadyRegisteredException extends RuntimeException {
  private final HttpStatus status;
  private final String message;
}

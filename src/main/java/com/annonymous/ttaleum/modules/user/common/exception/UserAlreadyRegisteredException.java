package com.annonymous.ttaleum.modules.user.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserAlreadyRegisteredException extends RuntimeException {
  private String message;
  private String errorCode;
}

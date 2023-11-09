package com.annonymous.ttaleum.modules.user.common;


import lombok.*;
import org.springframework.http.HttpStatus;


@Getter
@AllArgsConstructor
public class Result<T> {
  private HttpStatus code;
  private String message;
  private T data;

  public static <T> Result<T> success(String message, T data) {
    return new Result<>(HttpStatus.OK, message, data);
  }

  public static <T> Result<T> failure(String message) {
    return new Result<>(HttpStatus.INTERNAL_SERVER_ERROR, message, null);
  }

}

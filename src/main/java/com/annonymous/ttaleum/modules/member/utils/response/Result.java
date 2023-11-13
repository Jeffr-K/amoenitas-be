package com.annonymous.ttaleum.modules.member.utils.response;


import lombok.AllArgsConstructor;
import lombok.Getter;
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

  public static <T> Result<T> failure(HttpStatus statusCode, String message, T data) {
    return new Result<>(statusCode, message, data);
  }

}

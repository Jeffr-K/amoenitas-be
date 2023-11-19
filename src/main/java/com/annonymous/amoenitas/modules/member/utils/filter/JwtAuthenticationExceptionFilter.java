package com.annonymous.amoenitas.modules.member.utils.filter;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.JwtException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Slf4j
@Component
public class JwtAuthenticationExceptionFilter extends OncePerRequestFilter {

  @Override
  protected void doFilterInternal(
    HttpServletRequest request,
    HttpServletResponse response,
    FilterChain filterChain
  ) throws ServletException, IOException {
    try {
      filterChain.doFilter(request, response);
    } catch (ExpiredJwtException expiredJwtException) {
      log.error("JwtAuthenticationExceptionFilter: 유효기간이 만료된 토큰을 사용하였습니다.");
      setErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR, response, expiredJwtException);
    } catch (JwtException jwtException) {
      log.error("JwtAuthenticationExceptionFilter: 유효하지 않은 토큰을 사용하였습니다.");
      setErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR, response, jwtException);
    }
  }

  private void setErrorResponse(HttpStatus status, HttpServletResponse response, Throwable exception) {

  }
}

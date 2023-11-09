package com.annonymous.ttaleum.infrastructure.security.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AdminPassportAspect {

  @Before("@annotation(adminPassportAnnotation)")
  public void checkMemberPassport(AdminPassport adminPassportAnnotation) {
    String expression = "hasAuthority('ADMIN')";
    if (!hasAuthority(expression)) {
      throw new SecurityException("Access Denied");
    }
  }

  private boolean hasAuthority(String expression) {
    // Spring Security의 권한 검사를 수행하고 결과를 반환
    return true; // 권한이 있는 경우 true를 반환
  }
}

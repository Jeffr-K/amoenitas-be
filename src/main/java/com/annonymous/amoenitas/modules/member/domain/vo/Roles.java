package com.annonymous.amoenitas.modules.member.domain.vo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Roles {
  USER("USER"),
  ADMIN("ADMIN"),
  PROVIDER("PROVIDER");

  private final String value;
}

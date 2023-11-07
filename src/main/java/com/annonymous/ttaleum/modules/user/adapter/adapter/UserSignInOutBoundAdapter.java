package com.annonymous.ttaleum.modules.user.adapter.adapter;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public final class UserSignInOutBoundAdapter {
  @Schema(description = "회원 이름", example = "제프리")
  String name;

  @Schema(description = "회원 등급", example = "일반 유저")
  String roles;

  @Schema(description = "엑세스 토큰", example = "임의의 문자열")
  String token;
}

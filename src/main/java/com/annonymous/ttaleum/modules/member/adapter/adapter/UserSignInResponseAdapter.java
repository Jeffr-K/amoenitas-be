package com.annonymous.ttaleum.modules.member.adapter.adapter;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor(staticName = "instantiate")
public class UserSignInResponseAdapter {
  @Schema(description = "회원 이름", example = "제프리")
  private final String name;

  @Schema(description = "회원 등급", example = "일반 유저")
  private final String roles;

  @Schema(description = "엑세스 토큰", example = "임의의 문자열")
  private final String token;
}

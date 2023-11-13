package com.annonymous.ttaleum.modules.member.adapter.adapter;

import com.annonymous.ttaleum.modules.member.domain.vo.Roles;
import com.annonymous.ttaleum.infrastructure.utils.validator.Enums;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class UserRegistrationAdapter {
  @NotBlank(message = "닉네임은 필수 입력 값 입니다.")
  public String name;

  @NotBlank(message = "닉네임은 필수 입력 값 입니다.")
  public String nickname;

  @NotBlank(message = "비밀번호는 필수 입력 값 입니다.")
  public String password;

  @Email
  @NotBlank(message = "이메일은 필수 입력 값 입니다.")
  public String email;

  @NotBlank(message = "권한은 필수 입력 값 입니다.")
  @Enums(enumClass = Roles.class, message = "사용할 수 있는 권한이 아닙니다.")
  public String roles;
}

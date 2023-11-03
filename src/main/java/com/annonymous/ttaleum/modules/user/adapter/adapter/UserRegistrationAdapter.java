package com.annonymous.ttaleum.modules.user.adapter.adapter;

import com.annonymous.ttaleum.modules.user.domain.entity.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class UserRegistrationAdapter {
  @NotBlank(message = "닉네임은 필수 입력 값 입니다.")
  public String name;

  @NotBlank(message = "닉네임은 필수 입력 값 입니다.")
  public String nickname;

  @NotBlank(message = "비밀번호는 필수 입력 값 입니다.")
//  @Pattern(regexp="(?=.*[0-9])(?=.*[a-zA-Z])(?=.*\\W)(?=\\S+$).{8,20}", message = "비밀번호 오류 입니다.")
  public String password;

  @Email
  @NotBlank(message = "이메일은 필수 입력 값 입니다.")
  public String email;

  public User toEntity() {
    return new User(this.name, this.password, this.email);
  }
}

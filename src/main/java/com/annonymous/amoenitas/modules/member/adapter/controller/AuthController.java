package com.annonymous.amoenitas.modules.member.adapter.controller;

import com.annonymous.amoenitas.modules.member.adapter.adapter.UserSignInRequestAdapter;
import com.annonymous.amoenitas.modules.member.adapter.adapter.UserSignInResponseAdapter;
import com.annonymous.amoenitas.modules.member.service.port.MemberSignInUsecase;
import com.annonymous.amoenitas.modules.member.utils.response.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Authentication and Authorization")
@RestController
@RequestMapping(value = "/auth")
@RequiredArgsConstructor
public class AuthController {

  private final MemberSignInUsecase memberSignInService;

  @PostMapping("/signin")
  public Result<UserSignInResponseAdapter> signIn(
    @RequestBody UserSignInRequestAdapter adapter
  ) {
    return this.memberSignInService
      .signIn(adapter.getEmail(), adapter.getPassword());
  }

  @DeleteMapping("/signout")
  public void signOut() {}


  @PostMapping("/authentication/mobile")
  @Operation(summary = "모바일 휴대폰 인증", description = "")
  public void authenticateMobilePhone() {}

  @PostMapping("/authentication/email")
  @Operation(summary = "이메일 인증", description = "")
  public void authenticateEmail() {}

}

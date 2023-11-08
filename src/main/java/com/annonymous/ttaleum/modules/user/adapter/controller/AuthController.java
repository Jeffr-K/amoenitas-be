package com.annonymous.ttaleum.modules.user.adapter.controller;

import com.annonymous.ttaleum.modules.user.adapter.adapter.UserSignInRequestAdapter;
import com.annonymous.ttaleum.modules.user.adapter.adapter.UserSignInResponseAdapter;
import com.annonymous.ttaleum.modules.user.common.Result;
import com.annonymous.ttaleum.modules.user.service.UserSignInService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Authentication and Authorization")
@RestController
@RequestMapping(value = "/auth")
@RequiredArgsConstructor
public class AuthController {

  private final UserSignInService userSignInService;

  @PostMapping("/signin")
  public Result<UserSignInResponseAdapter> signIn(
    @RequestBody UserSignInRequestAdapter adapter
  ) {
    return this.userSignInService
      .signIn(adapter.getEmail(), adapter.getPassword());
  }

  @DeleteMapping("/signout")
  public void signOut() {}

}

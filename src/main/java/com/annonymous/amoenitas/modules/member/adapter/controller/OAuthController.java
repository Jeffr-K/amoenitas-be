package com.annonymous.amoenitas.modules.member.adapter.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "OAuth2")
@RestController
public class OAuthController {

  @PostMapping("/oauth/google")
  public void loginWithGoogle() {}

  @PostMapping("/oauth/naver")
  public void loginWithNaver() {}

  @PostMapping("/oauth/kakao")
  public void loginWithKakao() {}
}

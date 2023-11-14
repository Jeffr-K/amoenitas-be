package com.annonymous.ttaleum.modules.member.adapter.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "OAuth2")
@RestController
public class OAuthController {

  @PostMapping
  public void loginWithGoogle() {}

  @PostMapping
  public void loginWithNaver() {}

  @PostMapping
  public void loginWithKakao() {}
}

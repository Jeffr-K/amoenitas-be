package com.annonymous.ttaleum.modules.user.adapter.adapter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public final class UserSignInRequestAdapter {
  String email;
  String password;
}

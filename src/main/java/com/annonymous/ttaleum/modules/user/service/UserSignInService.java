package com.annonymous.ttaleum.modules.user.service;

import com.annonymous.ttaleum.modules.user.adapter.adapter.UserSignInResponseAdapter;
import com.annonymous.ttaleum.modules.user.common.Result;

public interface UserSignInService {
  Result<UserSignInResponseAdapter> signIn(String email, String password);
}

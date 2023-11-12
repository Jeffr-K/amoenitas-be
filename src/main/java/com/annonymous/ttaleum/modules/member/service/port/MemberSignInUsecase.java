package com.annonymous.ttaleum.modules.member.service.port;

import com.annonymous.ttaleum.modules.member.adapter.adapter.UserSignInResponseAdapter;
import com.annonymous.ttaleum.modules.member.utils.response.Result;

public interface MemberSignInUsecase {
  Result<UserSignInResponseAdapter> signIn(String email, String password);
}

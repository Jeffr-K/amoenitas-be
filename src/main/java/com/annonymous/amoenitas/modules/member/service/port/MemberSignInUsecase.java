package com.annonymous.amoenitas.modules.member.service.port;

import com.annonymous.amoenitas.modules.member.adapter.adapter.UserSignInResponseAdapter;
import com.annonymous.amoenitas.modules.member.utils.response.Result;

public interface MemberSignInUsecase {
  Result<UserSignInResponseAdapter> signIn(String email, String password);
}

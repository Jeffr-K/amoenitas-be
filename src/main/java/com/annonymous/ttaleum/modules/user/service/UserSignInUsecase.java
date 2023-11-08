package com.annonymous.ttaleum.modules.user.service;

import com.annonymous.ttaleum.modules.user.adapter.adapter.UserSignInResponseAdapter;
import com.annonymous.ttaleum.modules.user.common.Result;
import com.annonymous.ttaleum.modules.user.common.TokenProvider;
import com.annonymous.ttaleum.modules.user.domain.entity.User;
import com.annonymous.ttaleum.modules.user.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserSignInUsecase implements UserSignInService {

  private final TokenProvider tokenProvider;
  private final UserRepository userRepository;

  @Override
  public Result<UserSignInResponseAdapter> signIn(String email, String password) {
    User user = this.userRepository.findByEmail(email)
      .orElseThrow(IllegalArgumentException::new);

    String accessToken = this.tokenProvider.generateAccessToken(user.getEmail());

    return Result.success(
      "로그인이 성공적으로 완료되었습니다.",
      UserSignInResponseAdapter
        .instantiate(user.getName(), "USER", accessToken)
    );
  }
}

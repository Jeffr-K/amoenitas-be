package com.annonymous.ttaleum.modules.member.service.usecase;

import com.annonymous.ttaleum.modules.member.adapter.adapter.UserSignInResponseAdapter;
import com.annonymous.ttaleum.infrastructure.security.TokenProvider;
import com.annonymous.ttaleum.modules.member.service.port.MemberSignInUsecase;
import com.annonymous.ttaleum.modules.member.utils.exception.exception.UserNotFoundException;
import com.annonymous.ttaleum.modules.member.domain.entity.Member;
import com.annonymous.ttaleum.modules.member.domain.repository.UserRepository;
import com.annonymous.ttaleum.modules.member.utils.response.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserSignInUsecaseImpl implements MemberSignInUsecase {

  private final TokenProvider tokenProvider;
  private final UserRepository userRepository;

  @Override
  public Result<UserSignInResponseAdapter> signIn(String email, String password) {
//    Member user = this.userRepository.findByEmail(email)
//      .orElseThrow(IllegalArgumentException::new);

    Member user = this.userRepository.findByEmail(email)
      .orElseThrow(() -> new UserNotFoundException(HttpStatus.NOT_FOUND, "유저가 존재하지 않았습니다."));

    String accessToken = this.tokenProvider.generateAccessToken(String.format("%s:%s", user.getId(), user.getEmail()));

    return Result.success(
      "로그인이 성공적으로 완료되었습니다.",
      UserSignInResponseAdapter
        .instantiate(user.getName(), "USER", accessToken)
    );
  }
}

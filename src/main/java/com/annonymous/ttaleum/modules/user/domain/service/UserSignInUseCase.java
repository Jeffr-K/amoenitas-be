package com.annonymous.ttaleum.modules.user.domain.service;

import com.annonymous.ttaleum.modules.user.adapter.adapter.UserSignInAdapter;
import com.annonymous.ttaleum.modules.user.adapter.adapter.UserSignInOutBoundAdapter;
import com.annonymous.ttaleum.modules.user.common.TokenProvider;
import com.annonymous.ttaleum.modules.user.domain.entity.User;
import com.annonymous.ttaleum.modules.user.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserSignInUseCase {

  private final PasswordEncoder encoder;
  private final UserRepository userRepository;
  private final TokenProvider tokenProvider;

  @Transactional
  public UserSignInOutBoundAdapter signIn(UserSignInAdapter adapter) {
    User user = this.userRepository.findByEmail(adapter.getEmail())
      .filter(it -> encoder.matches(adapter.getPassword(), it.getPassword()))
      .orElseThrow(() -> new IllegalArgumentException("아이디 또는 비밀번호가 일치하지 않습니다."));

    String token = tokenProvider.generateAccessToken(String.format("%s%s", user.getId(), user.getEmail()));

    return new UserSignInOutBoundAdapter(user.getName(), "User", token);
  }
}

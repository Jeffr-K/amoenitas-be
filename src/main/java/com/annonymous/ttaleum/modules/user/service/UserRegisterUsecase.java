package com.annonymous.ttaleum.modules.user.service;

import com.annonymous.ttaleum.modules.user.domain.entity.Member;
import com.annonymous.ttaleum.modules.user.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserRegisterUsecase implements UserRegisterService {
  private final UserRepository userRepository;
  private final PasswordEncoder passwordEncoder;

  @Override
  public Member register(Member user) {
    Member member = new Member(
      user.name,
      this.passwordEncoder.encode(user.password),
      user.email
    );

    this.userRepository.save(member);

    return member;
  }
}

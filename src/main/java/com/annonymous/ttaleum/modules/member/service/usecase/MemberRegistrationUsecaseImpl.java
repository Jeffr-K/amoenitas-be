package com.annonymous.ttaleum.modules.member.service.usecase;

import com.annonymous.ttaleum.modules.member.adapter.adapter.UserRegistrationAdapter;
import com.annonymous.ttaleum.modules.member.domain.entity.Member;
import com.annonymous.ttaleum.modules.member.domain.repository.UserRepository;
import com.annonymous.ttaleum.modules.member.domain.vo.Roles;
import com.annonymous.ttaleum.modules.member.service.port.MemberRegistrationUsecase;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class MemberRegistrationUsecaseImpl implements MemberRegistrationUsecase {
  private final UserRepository userRepository;
  private final PasswordEncoder passwordEncoder;

  @Override
  public Member register(UserRegistrationAdapter adapter) {
    Roles roles = Roles.USER;
    if (Objects.equals(adapter.roles, "ADMIN")) {
      roles = Roles.ADMIN;
    }

    Member member = Member.from(
      adapter.name,
      adapter.nickname,
      this.passwordEncoder.encode(adapter.password),
      adapter.email,
      roles
    );

    this.userRepository.save(member);

    return member;
  }
}

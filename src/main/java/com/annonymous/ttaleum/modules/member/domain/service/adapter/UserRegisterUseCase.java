package com.annonymous.ttaleum.modules.member.domain.service.adapter;

import com.annonymous.ttaleum.modules.member.domain.entity.Member;
import com.annonymous.ttaleum.modules.member.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserRegisterUseCase {
  private final UserRepository userRepository;
  private final PasswordEncoder passwordEncoder;

  public void dropdown(Long userId) {
    this.userRepository.deleteById(userId);
  }

  public Optional<Member> getUser(Long userId) {
    return this.userRepository.findById(userId);
  }

  public Optional<Member> getUserByEmail(String email) {
    return this.userRepository.findByEmail(email);
  }

  public List<Member> getUsers() {
    return this.userRepository.findAll(Sort.by(Sort.Direction.DESC, "name"));
  }
}

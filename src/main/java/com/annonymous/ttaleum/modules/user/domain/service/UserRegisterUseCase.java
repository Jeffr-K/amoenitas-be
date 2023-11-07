package com.annonymous.ttaleum.modules.user.domain.service;

import com.annonymous.ttaleum.modules.user.domain.entity.User;
import com.annonymous.ttaleum.modules.user.domain.repository.UserRepository;
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

  public User register(User user) {
    User member = new User(
      user.name,
      this.passwordEncoder.encode(user.password),
      user.email
    );

    this.userRepository.save(member);

    return member;
  }

  public void dropdown(Long userId) {
    this.userRepository.deleteById(userId);
  }

  public Optional<User> getUser(Long userId) {
    return this.userRepository.findById(userId);
  }

  public List<User> getUsers() {
    return this.userRepository.findAll(Sort.by(Sort.Direction.DESC, "name"));
  }
}

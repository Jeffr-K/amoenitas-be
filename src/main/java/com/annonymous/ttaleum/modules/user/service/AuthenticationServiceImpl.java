package com.annonymous.ttaleum.modules.user.service;

import com.annonymous.ttaleum.infrastructure.database.repositories.CustomUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {

  private final CustomUserRepository userRepository;

  @Override
  public String signup(String request) {
    var user = User.builder().firstName().lastName().email().password().role().build();
    userRepository.save(user);
    var jwt = jwtService.generateToken(user);
    return JwtAuthenticationResponsel.builder().token(jwt).build();
  }

  @Override
  public String signin(String request) {
    authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));
    var user = userRepository.findByEmail(request.getEmail()).orElseThrow(() -> new IllegalArgumentException("Invalid email or password"));
    var jwt = jwtService.generateToken(user);
    return JwtAuthenticationResponse.builder().token(jwt).build();
  }
}

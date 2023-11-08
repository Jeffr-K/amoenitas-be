package com.annonymous.ttaleum.infrastructure.security;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class ApplicationSecurityConfig {
  private final JwtAuthenticationFilter jwtAuthenticationFilter;

  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http.csrf(AbstractHttpConfigurer::disable);

    http.authorizeHttpRequests(request ->
        request
          .requestMatchers("/user/*").permitAll()
          .requestMatchers("/user/signup").permitAll()
          .requestMatchers("/auth/signin/**", "/auth/signout/**").permitAll()
          .requestMatchers( "/swagger-ui/**").permitAll()
          .requestMatchers( "/api-docs/**").permitAll()
          .requestMatchers("/actuator/**").permitAll()
          .requestMatchers("/product/**").permitAll()
          .requestMatchers("/exception/**").permitAll()
          .anyRequest().authenticated()
      );

      http.sessionManagement(sessionManagement ->
        sessionManagement.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
      http.addFilterBefore(jwtAuthenticationFilter, BasicAuthenticationFilter.class);

      return http.build();
  }

  @Bean
  public PasswordEncoder getPasswordEncoder() {
    return new BCryptPasswordEncoder();
  }

}

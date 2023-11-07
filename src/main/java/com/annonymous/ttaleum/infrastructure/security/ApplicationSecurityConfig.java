package com.annonymous.ttaleum.infrastructure.security;

import com.annonymous.ttaleum.modules.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
@RequiredArgsConstructor
public class ApplicationSecurityConfig {

  private final JwtAuthenticationFilter jwtAuthenticationFilter;
  private final UserService userService;



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
    //      http.authenticationProvider(authenticationProvider())
//        .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
      return http.build();
  }

//  @Bean
//  public AuthenticationProvider authenticationProvider() {
//    DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
//    authenticationProvider.setUserDetailsService(userService.userDetailsService());
//    authenticationProvider.setPasswordEncoder(getPasswordEncoder());
//    return authenticationProvider;
//  }

  @Bean
  public PasswordEncoder getPasswordEncoder() {
    return new BCryptPasswordEncoder();
  }

}

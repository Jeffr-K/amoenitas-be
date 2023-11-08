package com.annonymous.ttaleum.modules.user.domain.entity;

import com.annonymous.ttaleum.modules.order.domain.entity.Order;
import com.annonymous.ttaleum.modules.user.adapter.adapter.UserRegistrationAdapter;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Long id;

  @Column
  public String name;

  @Column
  public String password;

  @Column(unique = true)
  public String email;

  @OneToMany
  private List<Order> order;

  public User(String name, String password, String email) {
    this.name = name;
    this.password = password;
    this.email = email;
  }

  public static User from(UserRegistrationAdapter adapter, PasswordEncoder encoder) {
    return User.builder()
      .name(adapter.name)
      .email(adapter.email)
      .password(encoder.encode(adapter.password))
      .build();
  }


}

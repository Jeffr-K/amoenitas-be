package com.annonymous.ttaleum.modules.user.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
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

  @Column
  public String email;

  public User(String name, String password, String email) {
    this.name = name;
    this.password = password;
    this.email = email;
  }


}

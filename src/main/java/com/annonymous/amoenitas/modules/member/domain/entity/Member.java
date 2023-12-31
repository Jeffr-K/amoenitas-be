package com.annonymous.amoenitas.modules.member.domain.entity;

import com.annonymous.amoenitas.infrastructure.database.JpaBaseEntity;
import com.annonymous.amoenitas.modules.member.domain.vo.Roles;
import com.annonymous.amoenitas.modules.order.domain.entity.Order;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Member extends JpaBaseEntity {
  @Column
  private String name;

  @Column
  private String nickName;

  @Column
  private String password;

  @Column(unique = true)
  private String email;

  @Enumerated(EnumType.STRING)
  @Column(nullable = false)
  private Roles roles;

  @OneToMany
  private List<Order> order;

  @OneToMany
  private List<UserPhoto> photos;

  public static Member from(String name, String nickName, String password, String email, Roles roles) {
    return Member.builder()
      .email(email)
      .name(name)
      .nickName(nickName)
      .password(password)
      .roles(roles)
      .build();
  }

}

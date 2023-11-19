package com.annonymous.amoenitas.modules.member.domain.entity;

import com.annonymous.amoenitas.infrastructure.database.JpaBaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserPhoto extends JpaBaseEntity {
  @Column(nullable = false)
  private String url;

  @Column(length = 2, nullable = false)
  private boolean represented;

  @ManyToOne
  @JoinColumn
  private Member member;

  public static UserPhoto from(String url, boolean represented) {
    return UserPhoto
      .builder()
      .url(url)
      .represented(represented)
      .build();
  }
}

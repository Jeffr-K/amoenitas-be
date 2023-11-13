package com.annonymous.ttaleum.infrastructure.database.repositories;


import com.annonymous.ttaleum.modules.member.domain.entity.Member;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class CustomUserRepositoryImpl implements CustomUserRepository {

  private final JPAQueryFactory jpaQueryFactory;

  @Override
  public List<Member> getUsers() {
    return null;
  }

}

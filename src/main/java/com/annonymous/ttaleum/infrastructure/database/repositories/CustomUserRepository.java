package com.annonymous.ttaleum.infrastructure.database.repositories;

import com.annonymous.ttaleum.modules.member.domain.entity.Member;

import java.util.List;

public interface CustomUserRepository {
  List<Member> getUsers();
}

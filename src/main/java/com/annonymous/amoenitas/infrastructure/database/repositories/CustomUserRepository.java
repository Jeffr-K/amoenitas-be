package com.annonymous.amoenitas.infrastructure.database.repositories;

import com.annonymous.amoenitas.modules.member.domain.entity.Member;

import java.util.List;

public interface CustomUserRepository {
  List<Member> getUsers();
}

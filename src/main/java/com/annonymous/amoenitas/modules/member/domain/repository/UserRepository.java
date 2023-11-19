package com.annonymous.amoenitas.modules.member.domain.repository;

import com.annonymous.amoenitas.infrastructure.database.repositories.CustomUserRepository;
import com.annonymous.amoenitas.modules.member.domain.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Member, Long>, CustomUserRepository {
  Optional<Member> findByEmail(String email);
}

package com.annonymous.ttaleum.modules.user.domain.repository;

import com.annonymous.ttaleum.infrastructure.database.repositories.CustomUserRepository;
import com.annonymous.ttaleum.modules.user.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long>, CustomUserRepository {
  Optional<User> findByEmail(String email);
}

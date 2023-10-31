package com.annonymous.ttaleum.infrastructure.database.repositories;

import com.annonymous.ttaleum.modules.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {}

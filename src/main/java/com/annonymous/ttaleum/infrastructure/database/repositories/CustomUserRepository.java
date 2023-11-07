package com.annonymous.ttaleum.infrastructure.database.repositories;

import com.annonymous.ttaleum.modules.user.domain.entity.User;

import java.util.List;

public interface CustomUserRepository {
  List<User> getUsers();
}

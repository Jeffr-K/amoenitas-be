package com.annonymous.ttaleum.modules.user.domain.port;

import com.annonymous.ttaleum.modules.user.adapter.adapter.UserRegistrationAdapter;

public interface UserRegistrationInBoundPort {
  void register(UserRegistrationAdapter adapter);
}

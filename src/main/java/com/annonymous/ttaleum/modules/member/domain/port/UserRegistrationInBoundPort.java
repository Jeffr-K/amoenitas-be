package com.annonymous.ttaleum.modules.member.domain.port;

import com.annonymous.ttaleum.modules.member.adapter.adapter.UserRegistrationAdapter;

public interface UserRegistrationInBoundPort {
  void register(UserRegistrationAdapter adapter);
}

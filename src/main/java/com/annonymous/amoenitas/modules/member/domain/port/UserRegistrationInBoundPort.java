package com.annonymous.amoenitas.modules.member.domain.port;

import com.annonymous.amoenitas.modules.member.adapter.adapter.UserRegistrationAdapter;

public interface UserRegistrationInBoundPort {
  void register(UserRegistrationAdapter adapter);
}

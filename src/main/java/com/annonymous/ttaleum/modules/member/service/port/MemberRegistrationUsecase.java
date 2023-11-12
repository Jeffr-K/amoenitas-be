package com.annonymous.ttaleum.modules.member.service.port;

import com.annonymous.ttaleum.modules.member.adapter.adapter.UserRegistrationAdapter;
import com.annonymous.ttaleum.modules.member.domain.entity.Member;

public interface MemberRegistrationUsecase {
  Member register(UserRegistrationAdapter adapter);
}

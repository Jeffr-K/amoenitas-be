package com.annonymous.amoenitas.modules.member.service.port;

import com.annonymous.amoenitas.modules.member.adapter.adapter.UserRegistrationAdapter;
import com.annonymous.amoenitas.modules.member.domain.entity.Member;

public interface MemberRegistrationUsecase {
  Member register(UserRegistrationAdapter adapter);
}

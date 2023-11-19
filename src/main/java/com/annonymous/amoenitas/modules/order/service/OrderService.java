package com.annonymous.amoenitas.modules.order.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class OrderService {

  @Transactional
  public void order(String port) {
    // port 를 기반으로 주문서 작성

    // order aggregate 에 추가
    // order aggregate event log 저장
    // 주문 번호 리턴
  }
}

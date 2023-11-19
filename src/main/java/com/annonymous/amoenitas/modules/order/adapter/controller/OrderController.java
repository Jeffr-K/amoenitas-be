package com.annonymous.amoenitas.modules.order.adapter.controller;

import com.annonymous.amoenitas.modules.order.adapter.adapter.OrderCreateAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderController {

  public void order(@RequestBody OrderCreateAdapter adapter) {

  }

  public void cancel() {}
}

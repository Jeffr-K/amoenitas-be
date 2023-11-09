package com.annonymous.ttaleum.modules.order.adapter.adapter;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class OrderCreateAdapter {
  private String userId;

  private List<Integer> products;

  private String deliveryMethod;
}

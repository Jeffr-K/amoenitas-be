package com.annonymous.amoenitas.modules.order.adapter.adapter;


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

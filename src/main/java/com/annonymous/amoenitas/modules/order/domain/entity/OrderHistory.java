package com.annonymous.amoenitas.modules.order.domain.entity;

import jakarta.persistence.*;

@Entity
public class OrderHistory {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column
  private String orderAggregateId;
}

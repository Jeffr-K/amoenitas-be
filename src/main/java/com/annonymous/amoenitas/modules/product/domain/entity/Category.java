package com.annonymous.amoenitas.modules.product.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Collection;

@Entity
@Getter
public class Category {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column
  private String name;

  @Column
  private String code;

  @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
  public Collection<Product> products = new ArrayList<>();

  public Category(String code, String name) {
    this.code = code;
    this.name = name;
  }

  protected Category() {}
}

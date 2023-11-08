package com.annonymous.ttaleum.modules.product.domain.entity;

import com.annonymous.ttaleum.modules.order.domain.entity.Order;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Collection;

@Entity
@Getter
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(length = 50)
  public String koreanName;

  @Column(length = 50)
  public String englishName;

  @Column(length = 50)
  public String volume;

  @Column(length = 50)
  public String price;

  @Column(length = 50)
  public String subDescription;

  @Column(length = 50)
  public String thumbnail;


  @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
  public Collection<Photo> photos = new ArrayList<>();

  @ManyToOne
  public Order order;

  @ManyToOne
  public Category category;

  protected Product() {}
  public Product(String koreanName, String englishName, String volume, String price, String subDescription, String thumbnail, Category category) {
    this.koreanName = koreanName;
    this.englishName = englishName;
    this.volume = volume;
    this.price = price;
    this.subDescription = subDescription;
    this.thumbnail = thumbnail;
    this.category = category;
  }

}

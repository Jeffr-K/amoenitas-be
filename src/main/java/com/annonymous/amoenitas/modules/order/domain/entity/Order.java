package com.annonymous.amoenitas.modules.order.domain.entity;

import com.annonymous.amoenitas.modules.product.domain.entity.Product;
import com.annonymous.amoenitas.modules.member.domain.entity.Member;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Orders")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Order {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @GeneratedValue(generator = "uuid2")
  @GenericGenerator(name="uuid2", type = org.hibernate.id.uuid.UuidGenerator.class)
  @Column(name = "uuid", columnDefinition = "BINARY(16)")
  private UUID uuid;

  @CreationTimestamp
  private Date orderedAt;

  @UpdateTimestamp
  private Date canceledAt;

  @OneToMany
  private List<Product> products;

  @ManyToOne
  private Member orderer;
}

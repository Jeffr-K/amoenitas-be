package com.annonymous.amoenitas.modules.order.domain.entity;

import com.annonymous.amoenitas.modules.order.domain.vo.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Invoice {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String id;

  @Column
  private Status status;

  @Column
  private String destination;

  @Column
  private String totalAmount;

  @Column
  private String recipient;

  @CreationTimestamp
  private Date orderedAt;

  @UpdateTimestamp
  private Date canceledAt;

  @Builder
  public Invoice(Status status) {
    this.status = status;
  }
}

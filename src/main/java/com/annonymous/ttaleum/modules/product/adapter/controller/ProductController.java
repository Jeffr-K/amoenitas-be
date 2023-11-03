package com.annonymous.ttaleum.modules.product.adapter.controller;

import com.annonymous.ttaleum.modules.product.service.usecase.ProductUseCase;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.annonymous.ttaleum.modules.product.adapter.adapter.ProductRegisterAdapter;

@RestController
@RequestMapping("/product")
@Validated
@RequiredArgsConstructor
public class ProductController {

  private final ProductUseCase productUseCase;

  @PostMapping("/creation")
  public void createProduct(@Valid @RequestBody ProductRegisterAdapter adapter) {
    this.productUseCase.register(adapter);
  }

  @PutMapping("/")
  public void editProduct() {}

  @DeleteMapping("/")
  public void deleteProduct() {}


}

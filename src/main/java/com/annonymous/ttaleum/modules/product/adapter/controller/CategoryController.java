package com.annonymous.ttaleum.modules.product.adapter.controller;

import com.annonymous.ttaleum.modules.product.adapter.adapter.CategoryRegisterAdapter;
import com.annonymous.ttaleum.modules.product.service.usecase.CategoryUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product/category")
@RequiredArgsConstructor
public class CategoryController {

  private final CategoryUseCase categoryUseCase;

  @PostMapping("/creation")
  public void registerCategory(@RequestBody CategoryRegisterAdapter adapter) {
    this.categoryUseCase.register(adapter);
  }
}

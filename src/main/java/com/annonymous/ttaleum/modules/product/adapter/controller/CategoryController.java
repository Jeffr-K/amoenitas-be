package com.annonymous.ttaleum.modules.product.adapter.controller;

import com.annonymous.ttaleum.modules.member.utils.response.Result;
import com.annonymous.ttaleum.modules.product.adapter.adapter.CategoryRegisterAdapter;
import com.annonymous.ttaleum.modules.product.service.usecase.CategoryUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/product/category")
@RequiredArgsConstructor
public class CategoryController {

  private final CategoryUseCase categoryUseCase;

  @PostMapping("/creation")
  public void registerCategory(@RequestBody CategoryRegisterAdapter adapter) {
    this.categoryUseCase.register(adapter);
  }

  @DeleteMapping
  public Result<String> deleteCategory() { return Result.success("asd", "asdasd"); }

  @PutMapping
  public Result<String> editCategory() { return Result.success("asd", "asdasd"); }

  @GetMapping
  public Result<String> getCategory() { return Result.success("asd", "asdasd"); }

  @GetMapping
  public Result<String> getCategories() { return Result.success("asd", "asdasd"); }
}

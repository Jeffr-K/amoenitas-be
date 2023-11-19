package com.annonymous.amoenitas.modules.product.adapter.controller;

import com.annonymous.amoenitas.modules.member.utils.response.Result;
import com.annonymous.amoenitas.modules.product.adapter.adapter.CategoryRegisterAdapter;
import com.annonymous.amoenitas.modules.product.service.usecase.CategoryUseCase;
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

  @DeleteMapping("/deletion")
  public Result<String> deleteCategory() { return Result.success("asd", "asdasd"); }

  @PutMapping("/edit")
  public Result<String> editCategory() { return Result.success("asd", "asdasd"); }

  @GetMapping("/search")
  public Result<String> getCategory() { return Result.success("asd", "asdasd"); }

  @GetMapping("/search/list")
  public Result<String> getCategories() { return Result.success("asd", "asdasd"); }
}

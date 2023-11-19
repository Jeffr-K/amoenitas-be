package com.annonymous.amoenitas.modules.cart.adapter.controller;

import com.annonymous.amoenitas.modules.cart.service.CartService;
import com.annonymous.amoenitas.modules.member.utils.response.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Cart")
@RestController
@RequiredArgsConstructor
public class CartController {

  private final CartService cartService;

  @PostMapping
  @Operation(summary = "장바구니에 상품 추가")
  public Result<String> addToCart() {
    return Result.success("asdsad", "asdasd");
  }

  @DeleteMapping
  @Operation(summary = "장바구니에 상품 삭제")
  public Result<String> deleteFromCart() {
    return Result.success("asdsad", "asdasd");
  }

  @PutMapping
  @Operation(summary = "장바구니에 상품 수정")
  public Result<String> editCartByProduct() {
    return Result.success("asdsad", "asdasd");
  }

  @GetMapping
  @Operation(summary = "장바구니에 상품 리스트 필터 별 조회")
  public Result<String> getProductFromCartPerFilter() {
    return Result.success("asdsad", "asdasd");
  }
}

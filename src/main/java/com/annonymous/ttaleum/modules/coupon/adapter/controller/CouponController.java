package com.annonymous.ttaleum.modules.coupon.adapter.controller;

import com.annonymous.ttaleum.modules.member.utils.response.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Tag(name = "")
@RestController
@RequiredArgsConstructor
public class CouponController {

  @PostMapping("/")
  @Operation(summary = "", description = "")
  public Result<String> registerCoupon() {
    return Result.success("", "");
  }

  @DeleteMapping("/")
  @Operation(summary = "", description = "")
  public Result<String> deleteCoupon() {
    return Result.success("", "");
  }

  @PutMapping("/")
  @Operation(summary = "", description = "")
  public Result<String> editCoupon() {
    return Result.success("", "");
  }

  @GetMapping("/")
  @Operation(summary = "", description = "")
  public Result<String> getCoupon() {
    return Result.success("", "");
  }

  @GetMapping("/")
  @Operation(summary = "", description = "")
  public Result<String> getCoupons() {
    return Result.success("", "");
  }
}

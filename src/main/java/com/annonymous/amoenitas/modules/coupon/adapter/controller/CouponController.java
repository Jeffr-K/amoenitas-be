package com.annonymous.amoenitas.modules.coupon.adapter.controller;

import com.annonymous.amoenitas.modules.member.utils.response.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Coupon")
@RestController
@RequiredArgsConstructor
public class CouponController {

  @PostMapping("/creation")
  @Operation(summary = "", description = "")
  public Result<String> registerCoupon() {
    return Result.success("", "");
  }

  @DeleteMapping("/deletion")
  @Operation(summary = "", description = "")
  public Result<String> deleteCoupon() {
    return Result.success("", "");
  }

  @PutMapping("/edit")
  @Operation(summary = "", description = "")
  public Result<String> editCoupon() {
    return Result.success("", "");
  }

  @GetMapping("/search")
  @Operation(summary = "", description = "")
  public Result<String> getCoupon() {
    return Result.success("", "");
  }

  @GetMapping("/search/list")
  @Operation(summary = "", description = "")
  public Result<String> getCoupons() {
    return Result.success("", "");
  }
}

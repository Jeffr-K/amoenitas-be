package com.annonymous.amoenitas.modules.payment.adapter.controller;

import com.annonymous.amoenitas.modules.member.utils.response.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Payment")
@RestController
@RequestMapping("/payment")
@RequiredArgsConstructor
public class PaymentController {

  @PostMapping("/")
  @Operation(summary = "결제", description = "")
  public Result<String> pay() {
    return Result.success("asdsad", "asdasd");
  }

  @DeleteMapping("/cancel-payment")
  @Operation(summary = "결제 취소", description = "")
  public Result<String> cancelPayment() {
    return Result.success("asdsad", "asdasd");
  }

  @DeleteMapping("/refund-payment")
  @Operation(summary = "결제 환불", description = "")
  public Result<String> refundPayment() {
    return Result.success("asdsad", "asdasd");
  }

  @GetMapping("/history")
  @Operation(summary = "결제 내역 조회", description = "")
  public Result<String> getPaymentHistory() {
    return Result.success("asdsad", "asdasd");
  }





}

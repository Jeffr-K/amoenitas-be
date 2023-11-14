package com.annonymous.ttaleum.modules.delivery.adapter.controller;

import com.annonymous.ttaleum.modules.member.utils.response.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Delivery")
@RestController
@RequiredArgsConstructor
public class DeliveryController {

  @GetMapping("/")
  @Operation(summary = "", description = "")
  public Result<String> getDeliveryHistory() {
    return Result.success("", "");
  }


}

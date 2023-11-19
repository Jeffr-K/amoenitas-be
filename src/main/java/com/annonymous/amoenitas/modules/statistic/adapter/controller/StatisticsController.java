package com.annonymous.amoenitas.modules.statistic.adapter.controller;

import com.annonymous.amoenitas.modules.member.utils.response.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "통계")
@RestController
@RequestMapping("/statistics")
@RequiredArgsConstructor
public class StatisticsController {

  @GetMapping("/latest-product")
  @Operation(summary = "", description = "")
  public Result<String> getProductShowsAtLatest() {
    return Result.success("", "");
  }

  @GetMapping("/product/history")
  @Operation(summary = "", description = "")
  public Result<String> getMyShoppingHistory() {
    return Result.success("", "");
  }
}

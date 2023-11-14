package com.annonymous.ttaleum.modules.statistic.adapter.controller;

import com.annonymous.ttaleum.modules.member.utils.response.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "통계")
@RestController
@RequiredArgsConstructor
public class StatisticsController {

  @GetMapping()
  @Operation(summary = "", description = "")
  public Result<String> getProductShowsAtLatest() {
    return Result.success("", "");
  }

  @GetMapping()
  @Operation(summary = "", description = "")
  public Result<String> getMyShoppingHistory() {
    return Result.success("", "");
  }
}

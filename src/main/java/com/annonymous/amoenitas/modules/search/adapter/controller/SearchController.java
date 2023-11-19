package com.annonymous.amoenitas.modules.search.adapter.controller;

import com.annonymous.amoenitas.modules.member.utils.response.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "")
@RestController
@RequestMapping("/search")
@RequiredArgsConstructor
public class SearchController {

  @GetMapping("/creation")
  @Operation(summary = "", description = "")
  public Result<String> search() {
    return Result.success("", "");
  }

  // 인기 검색어 | 최근 검색어 포함
  @GetMapping("/condition")
  @Operation(summary = "", description = "")
  public Result<String> searchBy() {
    return Result.success("", "");
  }

}

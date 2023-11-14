package com.annonymous.ttaleum.modules.cs.adapter.controller;

import com.annonymous.ttaleum.modules.member.utils.response.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Tag(name = "CustomerService")
@RestController
@RequestMapping("/cs")
@RequiredArgsConstructor
public class CSController {

  @PostMapping("/")
  @Operation(summary = "", description = "")
  public Result<String> inquireQuestion() {
    return Result.success("", "");
  }

  @DeleteMapping("/")
  @Operation(summary = "", description = "")
  public Result<String> deleteQuestion() {
    return Result.success("", "");
  }

  @PutMapping("/")
  @Operation(summary = "", description = "")
  public Result<String> editQuestion() {
    return Result.success("", "");
  }

  @GetMapping("/")
  @Operation(summary = "", description = "")
  public Result<String> getQuestion() {
    return Result.success("", "");
  }

  @GetMapping("/")
  @Operation(summary = "", description = "")
  public Result<String> getQuestions() {
    return Result.success("", "");
  }
}

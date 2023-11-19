package com.annonymous.amoenitas.modules.cs.adapter.controller;

import com.annonymous.amoenitas.modules.member.utils.response.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Tag(name = "CustomerService")
@RestController
@RequestMapping("/cs")
@RequiredArgsConstructor
public class CSController {

  @PostMapping("/inquire")
  @Operation(summary = "", description = "")
  public Result<String> inquireQuestion() {
    return Result.success("", "");
  }

  @DeleteMapping("/inquire/deletion")
  @Operation(summary = "", description = "")
  public Result<String> deleteQuestion() {
    return Result.success("", "");
  }

  @PutMapping("/inquire/edit")
  @Operation(summary = "", description = "")
  public Result<String> editQuestion() {
    return Result.success("", "");
  }

  @GetMapping("/inquire/search")
  @Operation(summary = "", description = "")
  public Result<String> getQuestion() {
    return Result.success("", "");
  }

  @GetMapping("/inquire/my/questions")
  @Operation(summary = "", description = "")
  public Result<String> getQuestions() {
    return Result.success("", "");
  }
}

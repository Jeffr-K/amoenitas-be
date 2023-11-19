package com.annonymous.amoenitas.modules.review.adapter;

import com.annonymous.amoenitas.modules.member.utils.response.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Review")
@RestController
@RequestMapping("/review")
@RequiredArgsConstructor
public class ReviewController {

  @PostMapping("/creation")
  @Operation(summary = "", description = "")
  public Result<String> registerReview() {
    return Result.success("", "");
  }

  @DeleteMapping("/deletion")
  @Operation(summary = "", description = "")
  public Result<String> deleteReview() {
    return Result.success("", "");
  }

  @PutMapping("/search")
  @Operation(summary = "", description = "")
  public Result<String> getReview() {
    return Result.success("", "");
  }

  @GetMapping("/search/list")
  @Operation(summary = "", description = "")
  public Result<String> getReviews() {
    return Result.success("", "");
  }

  @GetMapping("/edition")
  @Operation(summary = "", description = "")
  public Result<String> editReview() {
    return Result.success("", "");
  }
}

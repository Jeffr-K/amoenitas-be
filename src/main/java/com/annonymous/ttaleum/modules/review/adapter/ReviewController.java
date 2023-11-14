package com.annonymous.ttaleum.modules.review.adapter;

import com.annonymous.ttaleum.modules.member.utils.response.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Review")
@RestController
@RequestMapping("/review")
@RequiredArgsConstructor
public class ReviewController {

  @PostMapping()
  @Operation(summary = "", description = "")
  public Result<String> registerReview() {
    return Result.success("", "");
  }

  @DeleteMapping
  @Operation(summary = "", description = "")
  public Result<String> deleteReview() {
    return Result.success("", "");
  }

  @PutMapping
  @Operation(summary = "", description = "")
  public Result<String> getReview() {
    return Result.success("", "");
  }

  @GetMapping
  @Operation(summary = "", description = "")
  public Result<String> getReviews() {
    return Result.success("", "");
  }

  @GetMapping
  @Operation(summary = "", description = "")
  public Result<String> editReview() {
    return Result.success("", "");
  }
}

package com.annonymous.ttaleum.modules.banner.adapter;

import com.annonymous.ttaleum.modules.member.utils.response.Result;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

public class BannerController {

  @PostMapping
  public Result<String> registerBanner() { return Result.success("asd", "asdasd"); }

  @PutMapping
  public Result<String> editBanner() { return Result.success("asd", "asdasd"); }

  @DeleteMapping
  public Result<String> deleteBanner() { return Result.success("asd", "asdasd"); }

  @GetMapping
  public Result<String> getBanner() { return Result.success("asd", "asdasd"); }

  @GetMapping
  public Result<String> getBanners() { return Result.success("asd", "asdasd"); }
}

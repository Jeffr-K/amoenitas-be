package com.annonymous.amoenitas.modules.product.adapter.adapter;

import jakarta.validation.constraints.NotBlank;


public class ProductRegisterAdapter {
  @NotBlank(message = "제품명(한국)은 필수 입력 값 입니다.")
  public String koreanName;
  @NotBlank(message = "제품명(한국)은 필수 입력 값 입니다.")
  public String englishName;
  @NotBlank(message = "제품명(한국)은 필수 입력 값 입니다.")
  public String volume;
  @NotBlank(message = "제품명(한국)은 필수 입력 값 입니다.")
  public String price;
  @NotBlank(message = "제품명(한국)은 필수 입력 값 입니다.")
  public String subDescription;
  @NotBlank(message = "제품명(한국)은 필수 입력 값 입니다.")
  public String thumbnail;

//  @NotBlank(message = "제품명(한국)은 필수 입력 값 입니다.")
//  public List<String> photos;
//  @NotBlank(message = "제품명(한국)은 필수 입력 값 입니다.")
//  public String description;

  @NotBlank(message = "제품명(한국)은 필수 입력 값 입니다.")
  public String categoryId;
}

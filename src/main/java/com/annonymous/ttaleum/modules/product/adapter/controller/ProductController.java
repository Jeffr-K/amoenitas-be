package com.annonymous.ttaleum.modules.product.adapter.controller;

import com.annonymous.ttaleum.modules.member.utils.response.Result;
import com.annonymous.ttaleum.modules.product.domain.entity.Category;
import com.annonymous.ttaleum.modules.product.domain.entity.Product;
import com.annonymous.ttaleum.modules.product.service.usecase.ProductUseCase;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.annonymous.ttaleum.modules.product.adapter.adapter.ProductRegisterAdapter;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/product")
@Validated
@RequiredArgsConstructor
public class ProductController {

  private final ProductUseCase productUseCase;

  @PostMapping("/creation")
  public void createProduct(@Valid @RequestBody ProductRegisterAdapter adapter) {
    this.productUseCase.register(adapter);
  }

  @GetMapping("/search/{product_id}")
  public ResponseEntity<Map<String, String>> OneSelect(@PathVariable String product_id){
    Map<String, String> map = new HashMap<>();
    Optional<Product> result = this.productUseCase.findId(product_id);
    if(result.isPresent()){
      String koreanName = result.get().getKoreanName();
      String englishName = result.get().getEnglishName();
      String volume = result.get().getVolume();
      String price = result.get().getPrice();
      String subDescription = result.get().getSubDescription();
      String thumbnail = result.get().getThumbnail();


      map.put("koreanName", koreanName);
      map.put("englishName", englishName);
      map.put("volume", volume);
      map.put("price", price);
      map.put("subDescription", subDescription);
      map.put("thumbnail", thumbnail);

      return ResponseEntity.ok().body(map);

    }
    return ResponseEntity.ok().body(map);

  }

  @DeleteMapping("/")
  public void deleteProduct() {}

  @PostMapping("/")
  @Operation(summary = "상품 상세 조회 이벤트 등록")
  public Result<String> storeProductDetailSearchEvent() {}

  @PostMapping("/")
  public Result<String> registerProductPhoto() {}

  @PutMapping
  public Result<String> editProductPhoto() {}

  @DeleteMapping
  public Result<String> deleteProductPhoto() {}

  @GetMapping
  public Result<String> getProductPhoto() {}

  @GetMapping
  public Result<String> getProductPhotos() {}


  @GetMapping()
  @Operation(summary = "찜한 상품 보기")
  public Result<String> getPickProduct() {}

  @GetMapping()
  @Operation(summary = "찜한 상품 보기 리스트 조회")
  public Result<String> getPickProducts() {}

  @PostMapping()
  @Operation(summary = "상품 찜하기")
  public Result<String> pickProduct() {}

  @DeleteMapping()
  @Operation(summary = "상품 찜하기 삭제")
  public Result<String> unPickProduct() {}

  @PostMapping()
  @Operation(summary = "상품 북마크")
  public Result<String> bookmarkProduct() {}

  @DeleteMapping()
  @Operation(summary = "상품 북마크 해제")
  public Result<String> unBookmarkProduct() {}

  @GetMapping
  @Operation(summary = "북마크 된 상품 조회")
  public Result<String> getBookmarkedProduct() {}

}

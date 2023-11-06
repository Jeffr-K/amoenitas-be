package com.annonymous.ttaleum.modules.product.adapter.controller;

import com.annonymous.ttaleum.modules.product.domain.entity.Category;
import com.annonymous.ttaleum.modules.product.domain.entity.Product;
import com.annonymous.ttaleum.modules.product.service.usecase.ProductUseCase;
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
  @PutMapping("/")
  public void editProduct() {}

  @DeleteMapping("/")
  public void deleteProduct() {}


}

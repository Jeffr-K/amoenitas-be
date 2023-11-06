package com.annonymous.ttaleum.modules.product.service.usecase;

import com.annonymous.ttaleum.modules.product.adapter.adapter.ProductRegisterAdapter;
import com.annonymous.ttaleum.modules.product.domain.entity.Category;
import com.annonymous.ttaleum.modules.product.domain.entity.Product;
import com.annonymous.ttaleum.modules.product.domain.repository.CategoryRepository;
import com.annonymous.ttaleum.modules.product.domain.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductUseCase {

  private final ProductRepository productRepository;
  private final CategoryRepository categoryRepository;


  public void register(ProductRegisterAdapter adapter) {
    Optional<Category> category = this.categoryRepository.findById(Long.parseLong(adapter.categoryId));

    Product product = new Product(
      adapter.koreanName,
      adapter.englishName,
      adapter.volume,
      adapter.price,
      adapter.subDescription,
      adapter.thumbnail,
      category.get()
    );

    this.productRepository.save(product);
  }

  public Optional<Product> findId(String product_id){
    return this.productRepository.findById(Long.parseLong(product_id));
  }
}

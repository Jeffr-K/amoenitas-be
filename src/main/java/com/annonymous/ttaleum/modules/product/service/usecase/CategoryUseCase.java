package com.annonymous.ttaleum.modules.product.service.usecase;

import com.annonymous.ttaleum.modules.product.adapter.adapter.CategoryRegisterAdapter;
import com.annonymous.ttaleum.modules.product.domain.entity.Category;
import com.annonymous.ttaleum.modules.product.domain.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryUseCase {
  private final CategoryRepository categoryRepository;

  public void register(CategoryRegisterAdapter adapter) {
    Category category = new Category(adapter.code, adapter.name);
    this.categoryRepository.save(category);
  }

  public void delete() {}

  public void getCategory() {}

  public void getCategories() {}


}

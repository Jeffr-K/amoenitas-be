package com.annonymous.ttaleum.modules.product.adapter.controller;

import com.annonymous.ttaleum.modules.product.domain.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductsController {

  // localhost:8080/products?sortBy=최근등록순
  // localhost:8080/products?sortBy=판매인기순
  // localhost:8080/products?sortBy=낮은가격순
  // localhost:8080/products?sortBy=높은가격순
  public void getProducts() {

  }
}

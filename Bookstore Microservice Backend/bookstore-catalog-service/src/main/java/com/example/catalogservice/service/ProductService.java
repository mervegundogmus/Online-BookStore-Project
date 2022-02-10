package com.example.catalogservice.service;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.catalogservice.dto.request.CreateProductRequest;
import com.example.catalogservice.dto.request.UpdateProductRequest;
import com.example.catalogservice.dto.response.ProductResponse;
import com.example.catalogservice.entity.Product;

public interface ProductService {

	  String createProduct(@Valid CreateProductRequest createProductRequest);

	  ProductResponse getProduct(String productId);

	  void deleteProduct(String productId);

	  void updateProduct(UpdateProductRequest updateProductRequest);

	  Page<Product> findAllProducts(Pageable pageable);

	  Page<ProductResponse> getAllProducts(String sort, Integer page, Integer size);
	}


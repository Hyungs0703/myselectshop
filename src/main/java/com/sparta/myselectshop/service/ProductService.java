package com.sparta.myselectshop.service;

import com.sparta.myselectshop.dto.ProductRequestDto;
import com.sparta.myselectshop.dto.ProductResponseDto;
import com.sparta.myselectshop.entity.Product;
import com.sparta.myselectshop.repository.ProductRepsoitory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepsoitory productRepsoitory;

    //저장 기능구현
    public ProductResponseDto createProduct(ProductRequestDto requestDto) {
        Product product = productRepsoitory.save(new Product(requestDto));
        return new ProductResponseDto(product);
    }
}

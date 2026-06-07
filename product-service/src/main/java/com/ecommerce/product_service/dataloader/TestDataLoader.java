package com.ecommerce.product_service.dataloader;

import com.ecommerce.product_service.model.Product;
import com.ecommerce.product_service.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class TestDataLoader implements CommandLineRunner {

    private final ProductRepository productRepository;

    public TestDataLoader(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Product product = Product.builder()
                .name("Samsung Galaxy s23 ultra")
                .description("Smartphone con IA")
                .price(BigDecimal.valueOf(1200))
                .build();
        productRepository.save(product);
    }
}

package com.price.rules;

import com.price.domain.Product;

import java.util.List;

public class RuleMatcher implements IRuleMatcher{

    @Override
    public List<Product> matchProducts() {
        // query the products matching this rule, we may need to batch it
        return List.of(Product.builder().build());
    }

    @Override
    public boolean match(Product product) {
        return false;
    }
}

package com.price.rules;

import com.price.domain.Product;

import java.util.List;

public interface IRuleMatcher {

    public List<Product> matchProducts();

    public boolean match(Product product);
}

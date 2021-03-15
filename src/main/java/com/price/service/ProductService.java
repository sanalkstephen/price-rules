package com.price.service;

import com.price.domain.Product;
import com.price.rules.RuleEngine;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    RuleEngine ruleEngine;

    // TODO Add Product

    private void applyPriceRules(Product product) {
        ruleEngine.runRules(product);
    }

}

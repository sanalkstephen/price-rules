package com.price.rules;

import com.price.domain.Product;
import com.price.domain.RuleDefinition;

import java.util.List;

public class Rule {

    RuleDefinition ruleDefinition;

    IApplyStrategy applyStrategy;

    IRuleMatcher ruleMatcher;

    public Rule(IApplyStrategy applyStrategy, IRuleMatcher ruleMatcher, RuleDefinition ruleDefinition)  {
        this.applyStrategy = applyStrategy;
        this.ruleMatcher = ruleMatcher;
    }

    public List<Product> match() {
        return ruleMatcher.matchProducts();
    }

    public boolean match(Product product) {
        return ruleMatcher.match(product);
    }

    public ProductPrice apply(Product product) {
        Double price = applyStrategy.apply(product.getSignals());
        return ProductPrice.builder()
                .product(product)
                .appliedPrice(price)
                .build();
    }

}

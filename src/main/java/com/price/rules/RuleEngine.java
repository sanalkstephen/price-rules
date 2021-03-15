package com.price.rules;

import com.price.domain.Product;

import java.util.List;
import java.util.stream.Collectors;

public class RuleEngine {

    List<Rule> rules;

    public RuleEngine(List<Rule> rules) {
        this.rules = rules;
    }

    public void addRule(Rule rule) {
        rules.add(rule);
    }

    public void runRules() {
        rules.stream()
                .map(r -> new RuleAndProducts(r, r.match())
                )
                .map(
                        ruleAndProducts -> ruleAndProducts.matchedProducts.stream()
                                     .map(p -> ruleAndProducts.rule.apply(p))
                )
                //TODO Update the DB
                .collect(Collectors.toList());
    }

    public void runRules(Product product) {
        rules.stream()
                .filter(r -> r.match(product))
                //TODO sort based on priority
                .map(r -> r.apply(product))
                //filter the lowes price one
                .collect(Collectors.toList());

    }


    static class RuleAndProducts{
        Rule rule;
        List<Product> matchedProducts;
        public RuleAndProducts(Rule rule, List<Product> matchedProducts) {
            this.rule = rule;
            this.matchedProducts = matchedProducts;
        }
    }

}

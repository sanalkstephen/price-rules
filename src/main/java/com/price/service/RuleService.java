package com.price.service;

import com.price.domain.RuleDefinition;
import com.price.domain.SignalName;
import com.price.rules.DiscountedStrategy;
import com.price.rules.IRuleMatcher;
import com.price.rules.Rule;
import com.price.rules.RuleEngine;
import com.price.rules.RuleMatcher;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class RuleService {

    public RuleEngine ruleEngine;

    @PostConstruct
    public void loadRules() {
        IRuleMatcher ruleMatcher = new RuleMatcher();
        DiscountedStrategy discountedStrategy = new DiscountedStrategy(SignalName.MRP);
        this.ruleEngine = new RuleEngine(List.of(new Rule(discountedStrategy, ruleMatcher, RuleDefinition.builder().build())));
    }

    public void createRule(RuleDefinition ruleDefinition) {
        //TODO choose the apply strategy and mather based on definition
        IRuleMatcher ruleMatcher = new RuleMatcher();
        DiscountedStrategy discountedStrategy = new DiscountedStrategy(SignalName.MRP);
        ruleEngine.addRule(new Rule(discountedStrategy, ruleMatcher, ruleDefinition));
    }

    public void runRules() {
        ruleEngine.runRules();
    }

}

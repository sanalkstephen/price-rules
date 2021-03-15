package com.price.rules;

import com.price.domain.Signal;
import com.price.domain.SignalName;
import org.springframework.stereotype.Component;

import java.util.List;


public class DiscountedStrategy implements IApplyStrategy{

    public SignalName signalName;
    public Double percentage = .8;

    // Any configuration to take
    public DiscountedStrategy(SignalName signalName) {
        this.signalName = signalName;
    }

    public Double apply(List<Signal> signals) {
        return signals
                .stream()
                .filter(s -> signalName.equals(s.getSignalName()))
                .map(s -> s.getValue())
                .findFirst()
                .get() * percentage;
    }
}

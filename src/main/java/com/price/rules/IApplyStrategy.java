package com.price.rules;

import com.price.domain.Signal;

import java.util.List;

public interface IApplyStrategy {

    public Double apply(List<Signal> signals);

}

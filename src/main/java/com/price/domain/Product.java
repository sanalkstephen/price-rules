package com.price.domain;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public final class Product {

    private final String id;
    private final String brand;
    private final String vertical;
    private final List<Signal> signals;

}

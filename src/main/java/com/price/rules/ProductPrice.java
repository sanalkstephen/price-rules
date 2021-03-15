package com.price.rules;

import com.price.domain.Product;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductPrice {

    private final Product product;
    private final Double appliedPrice;
}

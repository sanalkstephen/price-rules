package com.price.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MatchingCriteria {

    private final String brand;
    private final String vertical;

}

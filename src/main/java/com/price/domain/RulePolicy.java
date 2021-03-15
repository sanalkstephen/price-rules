package com.price.domain;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class RulePolicy {

    private Signal signal;

}

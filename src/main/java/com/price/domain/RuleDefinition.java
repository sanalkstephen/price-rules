package com.price.domain;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class RuleDefinition {

    Date startTime;
    Date endTime;
    MatchingCriteria matchingCriteria;
    RulePolicy rulePolicy;

}

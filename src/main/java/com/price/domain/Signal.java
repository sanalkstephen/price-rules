package com.price.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Signal {

    public final SignalName signalName;
    public final Integer value;

}

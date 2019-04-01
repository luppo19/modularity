package com.example.modularity.order;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Builder
@Getter
class OrderCommand {

    private int quantity;
    private String name;
    private BigDecimal amount;
}

package com.example.modularity.order;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Builder
@Getter
class OrderMade {

    private long orderId;
    private long clientId;
    private int quantity;
    private String name;
    private BigDecimal amount;
}

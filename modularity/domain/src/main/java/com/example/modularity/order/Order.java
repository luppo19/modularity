package com.example.modularity.order;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Builder
@Data
@Entity
class Order {

    private int quantity;
    private String name;
    private BigDecimal amount;
    private String additionalData;
}

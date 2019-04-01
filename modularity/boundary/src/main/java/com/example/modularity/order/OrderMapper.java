package com.example.modularity.order;

class OrderMapper {

    static OrderCommand map(MakeOrder makeOrder) {
        return OrderCommand.builder()
                .amount(makeOrder.getAmount())
                .name(makeOrder.getName())
                .quantity(makeOrder.getQuantity())
                .build();
    }
}

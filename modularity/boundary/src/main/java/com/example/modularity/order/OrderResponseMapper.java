package com.example.modularity.order;

class OrderResponseMapper {

    static OrderResponse map(OrderMade orderMade) {
        return OrderResponse.builder()
                .amount(orderMade.getAmount())
                .clientId(orderMade.getClientId())
                .orderId(orderMade.getOrderId())
                .name(orderMade.getName())
                .quantity(orderMade.getQuantity())
                .build();
    }
}

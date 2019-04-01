package com.example.modularity.order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
class OrderRepositoryImpl implements OrderRepository {

    @Override
    public OrderMade save(Order order) {
        log.info("Ordering using JPA {}", order);
        return OrderMadeMapper.map(order);
    }
}

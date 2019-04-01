package com.example.modularity.order;

interface OrderMaker {

    OrderMade make(OrderCommand orderCommand);
}

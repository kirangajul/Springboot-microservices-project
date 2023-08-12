package com.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

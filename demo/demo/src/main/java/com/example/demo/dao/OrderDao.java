package com.example.demo.dao;

import com.example.demo.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDao extends JpaRepository<OrderEntity, Integer> {

}

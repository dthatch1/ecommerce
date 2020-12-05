package com.example.demo.service;

import com.example.demo.dao.OrderDao;
import com.example.demo.dto.OrderDetailsDTO;
import com.example.demo.entity.OrderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl {

    @Autowired
    private OrderDao orderDao;

    public void getOrderById(int orderId){
        Optional<OrderEntity> obj = orderDao.findById(orderId);
    }


    public void createOrder(OrderDetailsDTO orderDetailsDTO) {

    }

    public void cancelOrder(int orderId) {

    }
}

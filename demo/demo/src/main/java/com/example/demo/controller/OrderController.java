package com.example.demo.controller;


import com.example.demo.dto.OrderDetailsDTO;
import com.example.demo.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {

    @Autowired
    private OrderServiceImpl orderService;

    @GetMapping("/order/{orderId}")
    public void getOrder(@PathVariable int orderId){
        orderService.getOrderById(orderId);
    }

    @PostMapping("/createOrder")
    public void addOrder(@RequestBody OrderDetailsDTO orderDetailsDTO){
        orderService.createOrder(orderDetailsDTO);
    }

    @DeleteMapping("/cancelOrder/{orderId}")
    public void cancelOrder(@PathVariable int orderId){
        orderService.cancelOrder(orderId);
    }

}

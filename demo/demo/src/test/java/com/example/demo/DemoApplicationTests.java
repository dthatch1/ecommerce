package com.example.demo;


import com.example.demo.service.OrderServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class DemoApplicationTests {


    @Autowired
    OrderServiceImpl orderService;

    @Test
    public void testGetOrderId(){
        orderService.getOrderById(1234);
    }
}

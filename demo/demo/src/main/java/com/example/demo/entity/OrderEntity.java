package com.example.demo.entity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "Order")
@Getter
@Setter
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int order_id;
    private String order_status;
    private String order_customer_id;
    private String order_shipping_charges;
    private String order_total;
}

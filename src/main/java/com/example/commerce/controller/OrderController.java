package com.example.commerce.controller;

import com.example.commerce.model.Orders;
import com.example.commerce.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("http://localhost:5173")
@RestController
public class OrderController {
    @Autowired
    private OrderRepository orderRepository;

    @PostMapping("/order")
    Orders newOrders(@RequestBody Orders newOrders){ return orderRepository.save(newOrders);}

    @GetMapping("/orders")
    List<Orders> getAllOrders(){ return orderRepository.findAll(); }
}

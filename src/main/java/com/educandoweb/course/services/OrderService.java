package com.educandoweb.course.services;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.resources.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }


    public Order findByiD(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }

}

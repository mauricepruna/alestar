package com.example.alestar.alestar.controller;

import com.example.alestar.alestar.dao.AddressRepository;
import com.example.alestar.alestar.model.AddressEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressFinder {

    @Autowired
    public AddressRepository addressRepo;

    @GetMapping(value = "/{id}")
    public AddressEntity findById(@PathVariable("id") Integer id) {
        return addressRepo.findByAddressId(id);
    }
}

package com.example.alestar.alestar.dao;

import com.example.alestar.alestar.model.AddressEntity;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<AddressEntity, Integer> {

    AddressEntity findByAddressId(Integer addressId);
}

package com.example.alestar.alestar.dao;

import com.example.alestar.alestar.model.AddressEntity;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AddressRepositoryTest {

    @Autowired
    public AddressRepository addressRepo;
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testFetchByID(){
        AddressEntity addressEntity = addressRepo.findByAddressId(9);

        assertEquals("Bothell", addressEntity.getCity());
    }
}
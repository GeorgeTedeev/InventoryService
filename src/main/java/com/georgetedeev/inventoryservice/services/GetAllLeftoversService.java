package com.georgetedeev.inventoryservice.services;


import com.georgetedeev.inventoryservice.enteties.Inventory;
import com.georgetedeev.inventoryservice.repositories.InventoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllLeftoversService {

    @Autowired
    InventoryRepo inventoryRepo;

    public List<Inventory> getAllLeftovers(){
        return inventoryRepo.findAllLeftovers();
    }
}

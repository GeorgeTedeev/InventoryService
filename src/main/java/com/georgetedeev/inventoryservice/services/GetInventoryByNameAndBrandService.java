package com.georgetedeev.inventoryservice.services;

import com.georgetedeev.inventoryservice.enteties.Inventory;
import com.georgetedeev.inventoryservice.repositories.InventoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetInventoryByNameAndBrandService {

    @Autowired
    InventoryRepo inventoryRepo;

    public Inventory getInventoryByNameAndBrand(String name, String brand){
        return inventoryRepo.findByNameAndBrand(name,brand);
    }
}

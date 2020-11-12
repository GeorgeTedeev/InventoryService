package com.georgetedeev.inventoryservice.services;

import com.georgetedeev.inventoryservice.dto.InventoryDTO;
import com.georgetedeev.inventoryservice.repositories.InventoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateInventoryService {

    @Autowired
    InventoryRepo inventoryRepo;

    public InventoryDTO updateInventory(InventoryDTO inventoryDTO){
        Integer price = inventoryDTO.getPrice();
        Integer quantity = inventoryDTO.getQuantity();
        String name = inventoryDTO.getName();
        String brand = inventoryDTO.getBrand();

        inventoryRepo.updateInventory(price, quantity, name, brand);

        return inventoryDTO;
    }
}

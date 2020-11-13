package com.georgetedeev.inventoryservice.services;

import com.georgetedeev.inventoryservice.dto.InventoryDTO;
import com.georgetedeev.inventoryservice.enteties.Inventory;
import com.georgetedeev.inventoryservice.mappers.MapperForDTO;
import com.georgetedeev.inventoryservice.repositories.InventoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostNewInventoryService {

    @Autowired
    InventoryRepo inventoryRepo;

    public InventoryDTO postNewInventory(InventoryDTO inventoryDTO){
        Inventory inventory = MapperForDTO.convertFromDTO(inventoryDTO);
        inventory = inventoryRepo.save(inventory);
        inventoryDTO = MapperForDTO.convertToDTO(inventory);
        return inventoryDTO;
    }
}

package com.georgetedeev.inventoryservice.services;

import com.georgetedeev.inventoryservice.dto.InventoryDTO;
import com.georgetedeev.inventoryservice.dto.InventoryDTOWithNameAndBrand;
import com.georgetedeev.inventoryservice.enteties.Inventory;
import com.georgetedeev.inventoryservice.mappers.MapperForDTO;
import com.georgetedeev.inventoryservice.repositories.InventoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteInventoryService {

    @Autowired
    InventoryRepo inventoryRepo;

    public InventoryDTO deleteInventory(InventoryDTOWithNameAndBrand inventoryDTOWithNameAndBrand){
        String name = inventoryDTOWithNameAndBrand.getName();
        String brand = inventoryDTOWithNameAndBrand.getBrand();

        Inventory inventory = inventoryRepo.findByNameAndBrand(name, brand);

        inventoryRepo.delete(inventory);

        InventoryDTO inventoryDTO = MapperForDTO.convertToDTO(inventory);

        return inventoryDTO;
    }
}

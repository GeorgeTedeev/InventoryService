package com.georgetedeev.inventoryservice.services;

import com.georgetedeev.inventoryservice.dto.InventoryDTO;
import com.georgetedeev.inventoryservice.dto.InventoryDTOWithNameAndBrand;
import com.georgetedeev.inventoryservice.enteties.Inventory;
import com.georgetedeev.inventoryservice.mappers.MapperForDTO;
import com.georgetedeev.inventoryservice.repositories.InventoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetInventoryByNameAndBrandService {

    @Autowired
    InventoryRepo inventoryRepo;

    public InventoryDTO getInventoryByNameAndBrand(InventoryDTOWithNameAndBrand inventoryDTOWithNameAndBrand){
        Inventory inventory = inventoryRepo.findByNameAndBrand(inventoryDTOWithNameAndBrand.getName(),
                                                               inventoryDTOWithNameAndBrand.getBrand());
        InventoryDTO inventoryDTO = MapperForDTO.convertToDTO(inventory);

        return inventoryDTO;
    }
}

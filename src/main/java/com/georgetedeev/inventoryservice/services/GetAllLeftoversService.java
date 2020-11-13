package com.georgetedeev.inventoryservice.services;


import com.georgetedeev.inventoryservice.dto.InventoryDTO;
import com.georgetedeev.inventoryservice.enteties.Inventory;
import com.georgetedeev.inventoryservice.mappers.MapperForDTO;
import com.georgetedeev.inventoryservice.repositories.InventoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GetAllLeftoversService {

    @Autowired
    InventoryRepo inventoryRepo;

    public List<InventoryDTO> getAllLeftovers(){
        List<Inventory> inventories = inventoryRepo.findAllLeftovers();
        List<InventoryDTO> inventoryDTOS = MapperForDTO.convertListToDTO(inventories);

        return inventoryDTOS;
    }


}

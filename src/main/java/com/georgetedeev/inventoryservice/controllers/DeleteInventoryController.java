package com.georgetedeev.inventoryservice.controllers;

import com.georgetedeev.inventoryservice.dto.InventoryDTO;
import com.georgetedeev.inventoryservice.dto.InventoryDTOWithNameAndBrand;
import com.georgetedeev.inventoryservice.services.DeleteInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
public class DeleteInventoryController{

    @Autowired
    DeleteInventoryService deleteInventoryService;

    @PostMapping("/delete_inventory")
    public ResponseEntity<InventoryDTO> deleteInventory(@RequestBody InventoryDTOWithNameAndBrand inventoryDTOWithNameAndBrand){
        InventoryDTO inventoryDTO = deleteInventoryService.deleteInventory(inventoryDTOWithNameAndBrand);

        return ResponseEntity.ok(inventoryDTO);
    }
}



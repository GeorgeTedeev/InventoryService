package com.georgetedeev.inventoryservice.controllers;

import com.georgetedeev.inventoryservice.dto.InventoryDTO;
import com.georgetedeev.inventoryservice.services.UpdateInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
public class UpdateInventoryController {

    @Autowired
    UpdateInventoryService updateInventoryService;

    @PostMapping("/update_inventory")
    public ResponseEntity<InventoryDTO> updateInventory(@RequestBody InventoryDTO inventoryDTO){
        inventoryDTO = updateInventoryService.updateInventory(inventoryDTO);

        return ResponseEntity.ok(inventoryDTO);
    }
}

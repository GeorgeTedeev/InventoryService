package com.georgetedeev.inventoryservice.controllers;

import com.georgetedeev.inventoryservice.dto.InventoryDTO;
import com.georgetedeev.inventoryservice.services.PostNewInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
public class PostNewInventoryController {

    @Autowired
    PostNewInventoryService postNewInventoryService;

    @PostMapping("/new_inventory")
    public ResponseEntity<InventoryDTO> postNewInventory(@RequestBody InventoryDTO inventoryDTO){
        inventoryDTO = postNewInventoryService.postNewInventory(inventoryDTO);

        return ResponseEntity.ok(inventoryDTO);
    }
}

package com.georgetedeev.inventoryservice.controllers;


import com.georgetedeev.inventoryservice.dto.InventoryDTO;
import com.georgetedeev.inventoryservice.services.GetAllLeftoversService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/get")
public class GetAllLeftoversController {

    @Autowired
    GetAllLeftoversService getAllLeftoversService;

    @GetMapping("/leftovers")
    public ResponseEntity<List<InventoryDTO>> getAllLeftovers(){
        List<InventoryDTO> allLeftovers =  getAllLeftoversService.getAllLeftovers();

        return ResponseEntity.ok(allLeftovers);
    }
}

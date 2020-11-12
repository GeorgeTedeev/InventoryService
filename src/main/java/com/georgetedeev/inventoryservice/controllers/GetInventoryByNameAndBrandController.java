package com.georgetedeev.inventoryservice.controllers;


import com.georgetedeev.inventoryservice.dto.InventoryDTO;
import com.georgetedeev.inventoryservice.dto.InventoryDTOWithNameAndBrand;
import com.georgetedeev.inventoryservice.services.GetInventoryByNameAndBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/get")
public class GetInventoryByNameAndBrandController {

    @Autowired
    GetInventoryByNameAndBrandService getInventoryByNameAndBrandService;

    @GetMapping("/inventory")
    public ResponseEntity<InventoryDTO> getInventoryByNameAndBrand(@RequestBody InventoryDTOWithNameAndBrand inventoryDTOWithNameAndBrand){
        InventoryDTO inventoryDTO = getInventoryByNameAndBrandService.getInventoryByNameAndBrand(inventoryDTOWithNameAndBrand);

        return ResponseEntity.ok(inventoryDTO);
    }


}

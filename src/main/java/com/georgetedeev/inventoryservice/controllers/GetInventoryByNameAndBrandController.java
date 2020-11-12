package com.georgetedeev.inventoryservice.controllers;


import com.georgetedeev.inventoryservice.enteties.Inventory;
import com.georgetedeev.inventoryservice.services.GetInventoryByNameAndBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get")
public class GetInventoryByNameAndBrandController {

    @Autowired
    GetInventoryByNameAndBrandService getInventoryByNameAndBrandService;

    @GetMapping("/{name}/{brand}")
    public ResponseEntity<Inventory> getInventoryByNameAndBrand(@PathVariable("name") String name,
                                                             @PathVariable("brand") String brand){

        Inventory inventory = getInventoryByNameAndBrandService.getInventoryByNameAndBrand(name, brand);

        return ResponseEntity.ok(inventory);
    }


}

package com.georgetedeev.inventoryservice.repositories;

import com.georgetedeev.inventoryservice.enteties.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface InventoryRepo extends JpaRepository<Inventory,Long> {

    Inventory findByNameAndBrand(String name, String brand);

    @Query("select i from Inventory i where i.quantity < 5")
    List<Inventory> findAllLeftovers();

}

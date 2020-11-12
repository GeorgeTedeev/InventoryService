package com.georgetedeev.inventoryservice.repositories;

import com.georgetedeev.inventoryservice.enteties.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface InventoryRepo extends JpaRepository<Inventory,Long> {

    Inventory findByNameAndBrand(String name, String brand);

    @Query("select i from Inventory i where i.quantity < 5")
    List<Inventory> findAllLeftovers();

    @Modifying(clearAutomatically = true)
    @Transactional
    @Query("update Inventory i set i.price = :p, i.quantity = :q where i.name = :n and i.brand = :b")
    void updateInventory(@Param("p") Integer price,
                         @Param("q") Integer quantity,
                         @Param("n") String name,
                         @Param("b") String brand);

}

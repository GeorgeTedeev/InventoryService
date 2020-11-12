package com.georgetedeev.inventoryservice.mappers;

import com.georgetedeev.inventoryservice.dto.InventoryDTO;
import com.georgetedeev.inventoryservice.enteties.Inventory;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class MapperForDTO {

    private static ModelMapper mapper = new ModelMapper();

    public static InventoryDTO convertToDTO(Inventory inventory){
        return mapper.map(inventory, InventoryDTO.class);
    }

    public static Inventory convertFromDTO(InventoryDTO inventoryDTO){
        return mapper.map(inventoryDTO, Inventory.class);
    }

    public static List<InventoryDTO> convertListToDTO(List<Inventory> inventories){
        return inventories.stream().map(inventory -> mapper.map(inventory, InventoryDTO.class)).collect(Collectors.toList());
    }
}

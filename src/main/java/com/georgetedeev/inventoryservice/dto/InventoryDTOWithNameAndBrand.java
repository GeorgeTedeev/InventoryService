package com.georgetedeev.inventoryservice.dto;

public class InventoryDTOWithNameAndBrand {

    private String name;
    private String brand;

    public InventoryDTOWithNameAndBrand() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "InventoryDTOWithNameAndBrand{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}

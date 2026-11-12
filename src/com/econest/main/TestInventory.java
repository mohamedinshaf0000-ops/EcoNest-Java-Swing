
package com.econest.main;

import com.econest.model.Inventory;

public class TestInventory
{
    public static void main(String[] args)
    {
        Inventory inventory = new Inventory(
                1,
                8,
                10,
                "Green Garden Suppliers"
        );

        System.out.println("===== Inventory Details =====");

        System.out.println("Product ID: "
                + inventory.getProductId());

        System.out.println("Quantity: "
                + inventory.getQuantityOnHand());

        System.out.println("Reorder Level: "
                + inventory.getReorderLevel());

        System.out.println("Supplier: "
                + inventory.getSupplier());

        System.out.println("Low Stock: "
                + inventory.isLowStock());
    }
}

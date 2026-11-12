
package com.econest.model;

public class Inventory
{
    private int inventoryId;
    private int productId;
    private int quantityOnHand;
    private int reorderLevel;
    private String supplier;

    // Default constructor
    public Inventory()
    {
    }

    // Constructor for new inventory
    public Inventory(int productId, int quantityOnHand,
                     int reorderLevel, String supplier)
    {
        this.productId = productId;
        this.quantityOnHand = quantityOnHand;
        this.reorderLevel = reorderLevel;
        this.supplier = supplier;
    }

    // Constructor for existing inventory
    public Inventory(int inventoryId, int productId,
                     int quantityOnHand, int reorderLevel,
                     String supplier)
    {
        this.inventoryId = inventoryId;
        this.productId = productId;
        this.quantityOnHand = quantityOnHand;
        this.reorderLevel = reorderLevel;
        this.supplier = supplier;
    }

    public int getInventoryId()
    {
        return inventoryId;
    }

    public void setInventoryId(int inventoryId)
    {
        this.inventoryId = inventoryId;
    }

    public int getProductId()
    {
        return productId;
    }

    public void setProductId(int productId)
    {
        this.productId = productId;
    }

    public int getQuantityOnHand()
    {
        return quantityOnHand;
    }

    public void setQuantityOnHand(int quantityOnHand)
    {
        this.quantityOnHand = quantityOnHand;
    }

    public int getReorderLevel()
    {
        return reorderLevel;
    }

    public void setReorderLevel(int reorderLevel)
    {
        this.reorderLevel = reorderLevel;
    }

    public String getSupplier()
    {
        return supplier;
    }

    public void setSupplier(String supplier)
    {
        this.supplier = supplier;
    }

    // Check whether stock has reached the reorder level
    public boolean isLowStock()
    {
        return quantityOnHand <= reorderLevel;
    }

    @Override
    public String toString()
    {
        return "Product ID: " + productId
                + " | Quantity: " + quantityOnHand;
    }
}

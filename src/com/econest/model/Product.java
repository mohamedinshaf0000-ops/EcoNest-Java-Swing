
package com.econest.model;

public class Product
{
    private int productId;
    private String productName;
    private String category;
    private String description;
    private double price;
    private int ecoRating;

    // Default constructor
    public Product()
    {
    }

    // Constructor for a new product
    public Product(String productName, String category,
                   String description, double price, int ecoRating)
    {
        this.productName = productName;
        this.category = category;
        this.description = description;
        this.price = price;
        this.ecoRating = ecoRating;
    }

    // Constructor for an existing product
    public Product(int productId, String productName,
                   String category, String description,
                   double price, int ecoRating)
    {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.description = description;
        this.price = price;
        this.ecoRating = ecoRating;
    }

    public int getProductId()
    {
        return productId;
    }

    public void setProductId(int productId)
    {
        this.productId = productId;
    }

    public String getProductName()
    {
        return productName;
    }

    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    public String getCategory()
    {
        return category;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public int getEcoRating()
    {
        return ecoRating;
    }

    public void setEcoRating(int ecoRating)
    {
        this.ecoRating = ecoRating;
    }

    @Override
    public String toString()
    {
        return productName;
    }
}

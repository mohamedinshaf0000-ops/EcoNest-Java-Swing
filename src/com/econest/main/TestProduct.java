
package com.econest.main;

import com.econest.model.Product;

public class TestProduct
{
    public static void main(String[] args)
    {
        Product product = new Product(
                "Money Plant",
                "Plant",
                "Indoor plant",
                1500.00,
                5
        );

        System.out.println("Product: " + product.getProductName());
        System.out.println("Category: " + product.getCategory());
        System.out.println("Price: Rs. " + product.getPrice());
        System.out.println("Eco Rating: " + product.getEcoRating());
    }
}

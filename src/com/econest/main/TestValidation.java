
package com.econest.main;

import com.econest.util.Validation;
import java.time.LocalDate;

public class TestValidation
{
    public static void main(String[] args)
    {
        System.out.println("===== EcoNest Validation Test =====");

        System.out.println("Valid Name: "
                + Validation.isValidName("Ahmed"));

        System.out.println("Invalid Email: "
                + Validation.isValidEmail("ahmedgmail.com"));

        System.out.println("Valid Email: "
                + Validation.isValidEmail("ahmed@gmail.com"));

        System.out.println("Valid Phone: "
                + Validation.isValidPhone("0771234567"));

        System.out.println("Negative Price: "
                + Validation.isValidPrice(-500));

        System.out.println("Valid Price: "
                + Validation.isValidPrice(1500));

        System.out.println("Valid Eco Rating: "
                + Validation.isValidEcoRating(4));

        System.out.println("Invalid Eco Rating: "
                + Validation.isValidEcoRating(8));

        System.out.println("Valid Quantity: "
                + Validation.isValidQuantity(10));

        System.out.println("Valid Delivery Date: "
                + Validation.isValidDeliveryDate(
                        LocalDate.now().plusDays(2)));
    }
}

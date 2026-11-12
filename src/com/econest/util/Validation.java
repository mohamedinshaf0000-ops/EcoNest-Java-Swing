
package com.econest.util;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class Validation
{
    private static final Pattern EMAIL_PATTERN =
            Pattern.compile(
                "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$"
            );

    // Prevent object creation
    private Validation()
    {
    }

    // Check whether a required field is filled
    public static boolean isNotEmpty(String value)
    {
        return value != null && !value.trim().isEmpty();
    }

    // Validate a person's name
    public static boolean isValidName(String name)
    {
        return isNotEmpty(name)
                && name.trim().length() >= 2
                && name.trim().length() <= 100;
    }

    // Validate email format
    public static boolean isValidEmail(String email)
    {
        return isNotEmpty(email)
                && EMAIL_PATTERN.matcher(email.trim()).matches();
    }

    // Validate Sri Lankan phone number
    public static boolean isValidPhone(String phone)
    {
        if (!isNotEmpty(phone))
        {
            return false;
        }

        String cleaned = phone.replaceAll("[\\s-]", "");

        return cleaned.matches("0[0-9]{9}")
                || cleaned.matches("\\+94[0-9]{9}");
    }

    // Validate product price
    public static boolean isValidPrice(double price)
    {
        return Double.isFinite(price) && price >= 0;
    }

    // Validate eco-rating (1 to 5)
    public static boolean isValidEcoRating(int rating)
    {
        return rating >= 1 && rating <= 5;
    }

    // Validate stock quantity
    public static boolean isValidQuantity(int quantity)
    {
        return quantity >= 0;
    }

    // Validate order item quantity
    public static boolean isValidOrderQuantity(int quantity)
    {
        return quantity > 0;
    }

    // Validate reorder level
    public static boolean isValidReorderLevel(int level)
    {
        return level >= 0;
    }

    // Validate database ID
    public static boolean isValidId(int id)
    {
        return id > 0;
    }

    // Validate delivery date
    public static boolean isValidDeliveryDate(LocalDate date)
    {
        return date != null
                && !date.isBefore(LocalDate.now());
    }

    // Validate client type
    public static boolean isValidClientType(String type)
    {
        return "Household".equalsIgnoreCase(type)
                || "Office".equalsIgnoreCase(type);
    }

    // Validate product category
    public static boolean isValidProductCategory(String category)
    {
        return "Plant".equalsIgnoreCase(category)
                || "Planter".equalsIgnoreCase(category)
                || "Gardening Kit".equalsIgnoreCase(category);
    }

    // Validate delivery agent status
    public static boolean isValidAgentStatus(String status)
    {
        return "Available".equalsIgnoreCase(status)
                || "Busy".equalsIgnoreCase(status)
                || "Inactive".equalsIgnoreCase(status);
    }

    // Validate delivery status
    public static boolean isValidDeliveryStatus(String status)
    {
        return "Assigned".equalsIgnoreCase(status)
                || "Out for Delivery".equalsIgnoreCase(status)
                || "Delivered".equalsIgnoreCase(status)
                || "Cancelled".equalsIgnoreCase(status);
    }

    // Validate order status
    public static boolean isValidOrderStatus(String status)
    {
        return "Pending".equalsIgnoreCase(status)
                || "Processing".equalsIgnoreCase(status)
                || "Dispatched".equalsIgnoreCase(status)
                || "Completed".equalsIgnoreCase(status)
                || "Cancelled".equalsIgnoreCase(status);
    }
}

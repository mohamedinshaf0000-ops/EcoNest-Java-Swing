
package com.econest.model;

public class OrderItem
{
    private int orderItemId;
    private int orderId;
    private int productId;
    private int quantity;
    private double unitPrice;
    private double subtotal;

    public OrderItem() {}

    public OrderItem(int orderItemId, int orderId, int productId,
                     int quantity, double unitPrice)
    {
        this.orderItemId = orderItemId;
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        calculateSubtotal();
    }

    public double calculateSubtotal()
    {
        subtotal = quantity * unitPrice;
        return subtotal;
    }

    public int getOrderItemId() { return orderItemId; }
    public void setOrderItemId(int v) { orderItemId = v; }

    public int getOrderId() { return orderId; }
    public void setOrderId(int v) { orderId = v; }

    public int getProductId() { return productId; }
    public void setProductId(int v) { productId = v; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int v) { quantity = v; calculateSubtotal(); }

    public double getUnitPrice() { return unitPrice; }
    public void setUnitPrice(double v) { unitPrice = v; calculateSubtotal(); }

    public double getSubtotal() { return subtotal; }
    public void setSubtotal(double v) { subtotal = v; }
}

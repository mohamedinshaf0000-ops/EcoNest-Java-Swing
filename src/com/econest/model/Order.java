
package com.econest.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order
{
    private int orderId;
    private int clientId;
    private LocalDate orderDate;
    private double totalAmount;
    private String status;
    private List<OrderItem> items = new ArrayList<>();

    public Order() {}

    public Order(int orderId, int clientId, LocalDate orderDate,
                 double totalAmount, String status)
    {
        this.orderId = orderId;
        this.clientId = clientId;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    public void addItem(OrderItem item)
    {
        items.add(item);
        calculateTotal();
    }

    public void removeItem(OrderItem item)
    {
        items.remove(item);
        calculateTotal();
    }

    public double calculateTotal()
    {
        totalAmount = 0;

        for (OrderItem item : items)
        {
            totalAmount += item.calculateSubtotal();
        }

        return totalAmount;
    }

    public int getOrderId() { return orderId; }
    public void setOrderId(int v) { orderId = v; }

    public int getClientId() { return clientId; }
    public void setClientId(int v) { clientId = v; }

    public LocalDate getOrderDate() { return orderDate; }
    public void setOrderDate(LocalDate v) { orderDate = v; }

    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double v) { totalAmount = v; }

    public String getStatus() { return status; }
    public void setStatus(String v) { status = v; }

    public List<OrderItem> getItems() { return items; }
    public void setItems(List<OrderItem> v) { items = v; }

    @Override
    public String toString()
    {
        return "Order #" + orderId;
    }
}


package com.econest.model;

import java.time.LocalDate;

public class Delivery
{
    private int deliveryId;
    private int orderId;
    private int agentId;
    private LocalDate deliveryDate;
    private String status;

    public Delivery() {}

    public Delivery(int deliveryId, int orderId, int agentId,
                    LocalDate deliveryDate, String status)
    {
        this.deliveryId = deliveryId;
        this.orderId = orderId;
        this.agentId = agentId;
        this.deliveryDate = deliveryDate;
        this.status = status;
    }

    public int getDeliveryId() { return deliveryId; }
    public void setDeliveryId(int v) { deliveryId = v; }

    public int getOrderId() { return orderId; }
    public void setOrderId(int v) { orderId = v; }

    public int getAgentId() { return agentId; }
    public void setAgentId(int v) { agentId = v; }

    public LocalDate getDeliveryDate() { return deliveryDate; }
    public void setDeliveryDate(LocalDate v) { deliveryDate = v; }

    public String getStatus() { return status; }
    public void setStatus(String v) { status = v; }
}

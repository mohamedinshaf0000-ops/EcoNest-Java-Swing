
package com.econest.model;

public class DeliveryAgent
{
    private int agentId;
    private String agentName;
    private String phone;
    private String vehicleNumber;
    private String vehicleType;
    private String status;

    public DeliveryAgent() {}

    public DeliveryAgent(int agentId, String agentName, String phone,
                         String vehicleNumber, String vehicleType,
                         String status)
    {
        this.agentId = agentId;
        this.agentName = agentName;
        this.phone = phone;
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.status = status;
    }

    public int getAgentId() { return agentId; }
    public void setAgentId(int v) { agentId = v; }

    public String getAgentName() { return agentName; }
    public void setAgentName(String v) { agentName = v; }

    public String getPhone() { return phone; }
    public void setPhone(String v) { phone = v; }

    public String getVehicleNumber() { return vehicleNumber; }
    public void setVehicleNumber(String v) { vehicleNumber = v; }

    public String getVehicleType() { return vehicleType; }
    public void setVehicleType(String v) { vehicleType = v; }

    public String getStatus() { return status; }
    public void setStatus(String v) { status = v; }

    @Override
    public String toString()
    {
        return agentId + " - " + agentName;
    }
}

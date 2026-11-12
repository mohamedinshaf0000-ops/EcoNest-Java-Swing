
package com.econest.model;

public class Client
{
    private int clientId;
    private String clientName;
    private String clientType;
    private String phone;
    private String email;
    private String address;

    // Default constructor
    public Client()
    {
    }

    // Constructor for a new client
    public Client(String clientName, String clientType,
                  String phone, String email, String address)
    {
        this.clientName = clientName;
        this.clientType = clientType;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    // Constructor for an existing client
    public Client(int clientId, String clientName,
                  String clientType, String phone,
                  String email, String address)
    {
        this.clientId = clientId;
        this.clientName = clientName;
        this.clientType = clientType;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public int getClientId()
    {
        return clientId;
    }

    public void setClientId(int clientId)
    {
        this.clientId = clientId;
    }

    public String getClientName()
    {
        return clientName;
    }

    public void setClientName(String clientName)
    {
        this.clientName = clientName;
    }

    public String getClientType()
    {
        return clientType;
    }

    public void setClientType(String clientType)
    {
        this.clientType = clientType;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    @Override
    public String toString()
    {
        return clientName;
    }
}

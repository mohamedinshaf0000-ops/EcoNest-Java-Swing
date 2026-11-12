
package com.econest.main;

import com.econest.model.Client;

public class TestClient
{
    public static void main(String[] args)
    {
        Client client = new Client(
                "Ahmed",
                "Household",
                "0771234567",
                "ahmed@gmail.com",
                "Mawanella"
        );

        System.out.println("===== Client Details =====");
        System.out.println("Name: " + client.getClientName());
        System.out.println("Type: " + client.getClientType());
        System.out.println("Phone: " + client.getPhone());
        System.out.println("Email: " + client.getEmail());
        System.out.println("Address: " + client.getAddress());
    }
}


package com.econest.main;

import com.econest.util.DBConnection;
import java.sql.Connection;
import java.sql.SQLException;

public class TestConnection
{
    public static void main(String[] args)
    {
        try (Connection con = DBConnection.getConnection())
        {
            System.out.println("EcoNest Database Connected Successfully!");
        }
        catch (SQLException e)
        {
            System.out.println("Database Connection Failed!");
            System.out.println(e.getMessage());
        }
    }
}

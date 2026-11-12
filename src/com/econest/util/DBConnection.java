
package com.econest.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection
{
    private static final String URL =
            "jdbc:sqlserver://localhost:61303;"
            + "databaseName=econest_db;"
            + "integratedSecurity=true;"
            + "encrypt=true;"
            + "trustServerCertificate=true;";

    public static Connection getConnection() throws SQLException
    {
        return DriverManager.getConnection(URL);
    }
}

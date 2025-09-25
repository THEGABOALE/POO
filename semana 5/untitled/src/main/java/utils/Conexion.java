package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private final static String URL = "jdbc:postgresql://localhost:5432/Visitas";
    private final static String USERNAME = "postgres";
    private final static String PASSWORD = "1234";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
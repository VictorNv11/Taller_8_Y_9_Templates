package co.edu.sena.project2687350.util;

import java.sql.*;

public class BasicConnectionSingleton {
    private static String url = "jdbc:mysql://localhost:3306/MyLogin?serverTimezone=America/Bogota";
    private static String user = "victorr";
    private static String pass = "311Andres321";
    private static Connection conn;
    public static Connection getInstance() throws SQLException {
        if (conn == null) {
            conn = DriverManager.getConnection(url, user, pass);
        }
        return conn;
    }
}

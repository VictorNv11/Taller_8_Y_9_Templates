package co.edu.sena.project2687350.util;

import java.sql.*;

public class UseBasicConnectionSingleton {
    public static void main(String[] args) throws SQLException {
        try (Connection conn = BasicConnectionSingleton.getInstance();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from MyLogin.users_tbl")
        ) {
            while (rs.next()){
                System.out.print(rs.getString("user_firstname") + " ");
                System.out.print(rs.getString("user_lastname"));
            }
        }
    }
}

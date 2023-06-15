package co.edu.sena.project2687350.util;


import java.sql.*;

public class BasicConnectionWithResources {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/MyLogin?serverTimezone=America/Bogota";
        String username = "victorr";
        String password = "311Andres321";
        String sql = "select * from MyLogin.users_tbl";

        try(Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)
        ){
            while (rs.next()){
                System.out.print(rs.getString("user_firstname") + " ");
                System.out.print(rs.getString("user_lastname"));
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}

package co.edu.sena.project2687350.util;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionPool {
    private static String url = "jdbc:mysql://localhost:3306/MyLogin?serverTimezone=America/Bogota";
    private static String user = "victorr";
    private static String pass = "311Andres321";
    private static BasicDataSource pool;

    public static BasicDataSource getInstante() throws SQLException{
        if (pool == null){
            pool = new BasicDataSource();
            pool.setUrl(url);
            pool.setUsername(user);
            pool.setPassword(pass);
            pool.setInitialSize(5);
            pool.setInitialSize(5);
            pool.setMaxIdle(10);
            pool.setMaxTotal(10);
        }
        return pool;
    }

    public static Connection getConnection() throws SQLException{
        return getInstante().getConnection();
    }
}

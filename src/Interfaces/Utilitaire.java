package Interfaces;

import java.sql.*;

public class Utilitaire {
    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/médiathèque";
            return DriverManager.getConnection(url, "root", "");
        } catch (ClassNotFoundException e) {
            throw new SQLException("Error loading driver: " + e.getMessage());
        }
    }
}

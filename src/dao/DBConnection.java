package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/art_exhibition";
    private static final String USER = "root";        // your MySQL username
    private static final String PASSWORD = "24Scse1010";  // replace with your MySQL password

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("DB Connection Failed!");
            e.printStackTrace();
            return null;
        }
    }
}

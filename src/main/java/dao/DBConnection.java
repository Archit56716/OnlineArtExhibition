package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String URL =
        "jdbc:mysql://localhost:3306/art_exhibition?useSSL=false&serverTimezone=UTC";

    private static final String USER = "root";
    private static final String PASSWORD = "24Scse1010";

    public static Connection getConnection() {
        try {
            System.out.println("➡ Connecting to DB...");
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✅ DATABASE CONNECTED");
            return con;
        } catch (Exception e) {
            System.out.println("❌ DATABASE CONNECTION FAILED");
            e.printStackTrace();
            return null;
        }
    }
}

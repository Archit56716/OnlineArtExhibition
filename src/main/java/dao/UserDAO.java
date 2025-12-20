package dao;

import model.User;
import java.sql.*;

public class UserDAO {

    // ✅ CHECK IF EMAIL EXISTS
    public boolean emailExists(String email) {
        String sql = "SELECT 1 FROM users WHERE email = ?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, email.trim());
            ResultSet rs = ps.executeQuery();
            return rs.next(); // true ONLY if record exists

        } catch (Exception e) {
            e.printStackTrace();
            return false; // fail-safe
        }
    }

    // ✅ ADD USER
    public boolean addUser(User user) {
        String sql = "INSERT INTO users(name,email,password,role) VALUES(?,?,?,?)";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, user.getName().trim());
            ps.setString(2, user.getEmail().trim());
            ps.setString(3, user.getPassword());
            ps.setString(4, user.getRole());

            return ps.executeUpdate() == 1;

        } catch (SQLIntegrityConstraintViolationException e) {
            return false; // duplicate email safety
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}

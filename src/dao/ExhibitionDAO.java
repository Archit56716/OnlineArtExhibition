package dao;

import model.Exhibition;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ExhibitionDAO {

    public int addExhibition(Exhibition ex) {
        String sql = "INSERT INTO exhibitions(title,description,start_date,end_date,published) VALUES(?,?,?,?,?)";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, ex.getTitle());
            ps.setString(2, ex.getDescription());
            if (ex.getStartDate() != null) ps.setDate(3, Date.valueOf(ex.getStartDate())); else ps.setNull(3, Types.DATE);
            if (ex.getEndDate() != null) ps.setDate(4, Date.valueOf(ex.getEndDate())); else ps.setNull(4, Types.DATE);
            ps.setBoolean(5, ex.isPublished());
            int affected = ps.executeUpdate();

            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) ex.setId(rs.getInt(1));
            }
            return affected;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public List<Exhibition> getAllExhibitions() {
        List<Exhibition> list = new ArrayList<>();
        String sql = "SELECT * FROM exhibitions";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Exhibition e = new Exhibition();
                e.setId(rs.getInt("id"));
                e.setTitle(rs.getString("title"));
                e.setDescription(rs.getString("description"));
                e.setPublished(rs.getBoolean("published"));
                list.add(e);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}

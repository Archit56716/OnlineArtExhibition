package dao;

import model.Artwork;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ArtworkDAO {

    public int addArtwork(Artwork a) {
        String sql = "INSERT INTO artworks(title,description,image_url,artist_id,price,approved) VALUES(?,?,?,?,?,?)";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, a.getTitle());
            ps.setString(2, a.getDescription());
            ps.setString(3, a.getImageUrl());
            if (a.getArtistId() > 0) ps.setInt(4, a.getArtistId()); else ps.setNull(4, Types.INTEGER);
            ps.setDouble(5, a.getPrice());
            ps.setBoolean(6, a.isApproved());
            int affected = ps.executeUpdate();

            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) a.setId(rs.getInt(1));
            }
            return affected;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public List<Artwork> getApprovedArtworks() {
        List<Artwork> list = new ArrayList<>();
        String sql = "SELECT * FROM artworks WHERE approved = true";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Artwork a = new Artwork();
                a.setId(rs.getInt("id"));
                a.setTitle(rs.getString("title"));
                a.setDescription(rs.getString("description"));
                a.setImageUrl(rs.getString("image_url"));
                a.setArtistId(rs.getInt("artist_id"));
                a.setPrice(rs.getDouble("price"));
                a.setApproved(rs.getBoolean("approved"));
                list.add(a);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}

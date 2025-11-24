package app;

import dao.UserDAO;
import dao.ArtworkDAO;
import dao.ExhibitionDAO;
import model.User;
import model.Artwork;
import model.Exhibition;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting Java JDBC demo...");

        // USER
        UserDAO userDAO = new UserDAO();
        User u = new User("Admin", "admin@example.com", "adminpass", "admin");
        int res = userDAO.addUser(u);
        System.out.println("Inserted user id: " + u.getId() + " (affected=" + res + ")");

        User fetched = userDAO.getUserByEmail("admin@example.com");
        System.out.println("Fetched user: " + fetched);

        // ARTWORK
        ArtworkDAO artDAO = new ArtworkDAO();
        Artwork art = new Artwork("Sunset", "Nice painting", null, u.getId(), 199.99, true);
        artDAO.addArtwork(art);
        System.out.println("Inserted artwork id: " + art.getId());

        List<Artwork> arts = artDAO.getApprovedArtworks();
        System.out.println("Approved artworks count: " + arts.size());

        // EXHIBITION
        ExhibitionDAO exDAO = new ExhibitionDAO();
        Exhibition ex = new Exhibition("Autumn Show", "Seasonal works", LocalDate.now(), LocalDate.now().plusDays(7), true);
        exDAO.addExhibition(ex);
        System.out.println("Inserted exhibition id: " + ex.getId());

        System.out.println("Demo finished.");
    }
}

package app;

import dao.UserDAO;
import model.User;

public class Main {

    public static void main(String[] args) {

        UserDAO userDAO = new UserDAO();

        User u = new User("Admin", "admin@example.com", "adminpass", "admin");

        boolean success = userDAO.addUser(u);

        if (success) {
            System.out.println("User inserted successfully");
        } else {
            System.out.println("User insert failed (maybe duplicate)");
        }
    }
}

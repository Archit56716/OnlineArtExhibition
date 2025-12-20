package servlet;

import dao.UserDAO;
import model.User;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class SignupServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name").trim();
        String email = req.getParameter("email").trim();
        String password = req.getParameter("password");

        UserDAO dao = new UserDAO();

        // ✅ CHECK DUPLICATE
        if (dao.emailExists(email)) {
            resp.getWriter().println("Email already exists");
            return;
        }

        User user = new User(name, email, password, "enthusiast");

        if (dao.addUser(user)) {
            resp.getWriter().println("Signup successful!");
        } else {
            resp.getWriter().println("Signup failed");
        }
    }
}

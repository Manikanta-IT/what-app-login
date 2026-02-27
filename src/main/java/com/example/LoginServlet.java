package com.example;

import java.io.IOException;
import java.sql.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private static final String DB_URL =
            "jdbc:mysql://localhost:3306/whatsapp_db";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "root"; // change password

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String phone = request.getParameter("phone");
        String password = request.getParameter("password");

        response.setContentType("text/html");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(
                    DB_URL, DB_USER, DB_PASS);

            String sql = "SELECT * FROM users WHERE phone=? AND password=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, phone);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                response.getWriter().println("<h2>Login Successful ✅</h2>");
            } else {
                response.getWriter().println("<h2>Invalid Credentials ❌</h2>");
            }

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("<h3>Database Error ❌</h3>");
        }
    }
}

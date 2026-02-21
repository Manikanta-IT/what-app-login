package com.example;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String phone = request.getParameter("phone");
        String password = request.getParameter("password");

        response.setContentType("text/html");

        if (phone.equals("admin") && password.equals("1234")) {
            response.getWriter().println("<h2>Login Successful ✅</h2>");
        } else {
            response.getWriter().println("<h2>Invalid Credentials ❌</h2>");
        }
    }
}

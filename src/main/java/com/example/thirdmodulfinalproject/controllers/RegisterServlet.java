package com.example.thirdmodulfinalproject.controllers;
import com.example.thirdmodulfinalproject.entity.User;
import com.example.thirdmodulfinalproject.repositories.QuestionsRepo;
import com.example.thirdmodulfinalproject.repositories.UserRepo;
import com.example.thirdmodulfinalproject.util.CurrentQuestion;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doGet method of RegisterServlet is called.");
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/view/register.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        UserRepo.storage.add(new User(name, surname, username, password, email));
        response.sendRedirect("http://localhost:8080/");
    }
}

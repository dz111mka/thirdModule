package com.example.thirdmodulfinalproject.controllers;

import com.example.thirdmodulfinalproject.entity.Question;
import com.example.thirdmodulfinalproject.entity.User;
import com.example.thirdmodulfinalproject.repositories.QuestionsRepo;
import com.example.thirdmodulfinalproject.repositories.UserRepo;
import com.example.thirdmodulfinalproject.util.CurrentQuestion;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    List<User> userList = UserRepo.storage;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doGet method of LoginServlet is called.");
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/view/login.jsp");
        CurrentQuestion.value = QuestionsRepo.mainQuestion;
        rd.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        System.out.println(username + " " + password);


        User user = isValid(username, password);
        System.out.println(user);
        if (user != null) {
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            response.sendRedirect("http://localhost:8080/start");
        } else {
            response.sendRedirect("http://localhost:8080/login");
        }
    }

    private User isValid(String username, String password) {
        for (User user : userList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}

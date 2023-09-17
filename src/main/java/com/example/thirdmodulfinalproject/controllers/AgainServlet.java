package com.example.thirdmodulfinalproject.controllers;

import com.example.thirdmodulfinalproject.repositories.QuestionsRepo;
import com.example.thirdmodulfinalproject.util.CurrentQuestion;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/again")
public class AgainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        CurrentQuestion.value = QuestionsRepo.mainQuestion;
        resp.sendRedirect("http://localhost:8080/start");
    }
}

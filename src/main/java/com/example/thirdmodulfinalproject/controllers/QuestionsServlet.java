package com.example.thirdmodulfinalproject.controllers;

import com.example.thirdmodulfinalproject.util.CurrentQuestion;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.example.thirdmodulfinalproject.entity.User;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/questions")
public class QuestionsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("doGet method of QuestionsServlet is called.");
        String answer = request.getParameter("answer");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        String context = request.getSession().getId();
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/congratz");
        String congratz = "ПОЗДРАВЛЯЮ";


        if (answer.equals("answer1")) {
            CurrentQuestion.value = CurrentQuestion.value.getNextAnswerLeft();
        }

        if (answer.equals("answer2")) {
            CurrentQuestion.value = CurrentQuestion.value.getNextAnswerRight();
        }

        if (CurrentQuestion.value.getNextAnswerLeft() == null && CurrentQuestion.value.getNextAnswerRight() == null) {
            response.sendRedirect("http://localhost:8080/congratz");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<title>Start Page</title>");
            out.println("<link rel=\"stylesheet\" href=\"../style.css\">");
            out.println("</head>");
            out.println("<body>");
            out.println("<p>" + congratz + "</p>");
            out.println("</body>");
            out.println("</html>");
        }


        if (answer.equals("answer1")) {
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<title>Start Page</title>");
            out.println("<link rel=\"stylesheet\" href=\"../style.css\">");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class=\"wrapper\">");
            out.println("<header>");
            out.println("<h1>Квест \"Поиск сокровищ\"</h1>");
            out.println("</header>");
            out.println("<main>");
            out.println("<div class=\"game\">");
            out.println("<form action=\"questions\" method=\"get\">");
            out.println("<p><b>" + CurrentQuestion.value + "</p></b>");
            out.println("<p><b></b></p>");


            if (CurrentQuestion.value.getNextAnswerLeft() != null) {
                out.println("<input id=\"a1\" type=\"radio\" name=\"answer\" value=\"answer1\">");
                out.println("<label for=\"a1\">" + CurrentQuestion.value.getAnswerLeft() + "</label>");
            }

            if (CurrentQuestion.value.getNextAnswerRight() != null) {
                out.println("<input id=\"a2\" type=\"radio\" name=\"answer\" value=\"answer2\">");
                out.println("<label for=\"a2\">" + CurrentQuestion.value.getAnswerRight() + "</label>");
            }


            out.println("<input class=\"register-btn\" type=\"submit\" value=\"Принять решение\">");
            out.println("</form>");
            out.println("</div>");
            out.println("</main>");
            out.println("<footer>");
            out.println("<div class=\"statistic\">");
            out.println("<p>Статистика</p>");
            out.println("<p>IP address user:" + request.getRemoteAddr() + " </p>");
            out.println("<p>Username:" + ((User) session.getAttribute("user")).getUsername() + "</p>");
            out.println("<p>Id Session" + context + "</p>");
            out.println("</div>");
            out.println("<p>&copy; 2023 Квест \"Поиск сокровищ\". Все права защищены.</p>");
            out.println("</footer>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");

        }

        if (answer.equals("answer2")) {
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<title>Start Page</title>");
            out.println("<link rel=\"stylesheet\" href=\"../style.css\">");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class=\"wrapper\">");
            out.println("<header>");
            out.println("<h1>Квест \"Поиск сокровищ\"</h1>");
            out.println("</header>");
            out.println("<main>");
            out.println("<div class=\"game\">");
            out.println("<form action=\"questions\" method=\"get\">");
            out.println("<p><b>" + CurrentQuestion.value + "</p></b>");
            out.println("<p><b></b></p>");

            if (CurrentQuestion.value.getNextAnswerLeft() != null) {
                out.println("<input id=\"a1\" type=\"radio\" name=\"answer\" value=\"answer1\">");
                out.println("<label for=\"a1\">" + CurrentQuestion.value.getAnswerLeft() + "</label>");
            }

            if (CurrentQuestion.value.getNextAnswerRight() != null) {
                out.println("<input id=\"a2\" type=\"radio\" name=\"answer\" value=\"answer2\">");
                out.println("<label for=\"a2\">" + CurrentQuestion.value.getAnswerRight() + "</label>");
            }

            out.println("<input class=\"register-btn\" type=\"submit\" value=\"Принять решение\">");
            out.println("</form>");
            out.println("</div>");
            out.println("</main>");
            out.println("<footer>");
            out.println("<div class=\"statistic\">");
            out.println("<p>Статистика</p>");
            out.println("<p>IP address user:" + request.getRemoteAddr() + " </p>");
            out.println("<p>Username:" + ((User) session.getAttribute("user")).getUsername() + "</p>");
            out.println("<p>Id Session" + context + "</p>");
            out.println("</div>");
            out.println("<p>&copy; 2023 Квест \"Поиск сокровищ\". Все права защищены.</p>");
            out.println("</footer>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}


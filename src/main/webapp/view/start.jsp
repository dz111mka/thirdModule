<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ page import="com.example.thirdmodulfinalproject.entity.User" %>
<%@ page import="com.example.thirdmodulfinalproject.entity.Question" %>
<%@ page import="com.example.thirdmodulfinalproject.repositories.QuestionsRepo" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Start Page</title>
    <link rel="stylesheet" href="../style.css">
</head>

<body>



<div class="wrapper">
    <header>
        <h1>Квест "Поиск сокровищ"</h1>
    </header>
    <main>
        <div>
            <p>Welcome <%= ((User) session.getAttribute("user")).getUsername() %>! </p>
            <p>You have successfully logged in.</p>
        </div>

        <div class="game">
            <form action="questions" method="get">
                <p><b><%
                    out.println(QuestionsRepo.mainQuestion.getQuestion());
                %></b></p>
                <p><b></b></p>

                <input id="a1" type="radio" name="answer" value="answer1">
                <label for="a1">
                    <%
                        out.println(QuestionsRepo.mainQuestion.getAnswerLeft());
                    %>
                </label>
                <input id="a2" type="radio" name="answer" value="answer2">
                <label for="a2"><%
                    out.println(QuestionsRepo.mainQuestion.getAnswerRight());
                %></label>
                <input class="register-btn" type="submit" value="Начать">

            </form>
        </div>

    </main>
    <footer>
        <div class="statistic">
            <p>Статистика</p>
            <p>IP address user: <%= request.getRemoteAddr() %>
            </p>
            <p>Username: <%= ((User) session.getAttribute("user")).getUsername() %>!</p>
            <p>Id Session <c:out value="${pageContext.session.id}"/></p>
        </div>
        <p>&copy; 2023 Квест "Поиск сокровищ". Все права защищены.</p>
    </footer>
</div>

</body>
</html>
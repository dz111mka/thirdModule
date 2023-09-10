<%@ page import="com.example.thirdmodulfinalproject.repositories.UserRepo" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.thirdmodulfinalproject.entity.User" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<div class="wrapper">
    <header>
        <h1>Квест "Поиск сокровищ"</h1>
        <p>Присоединяйтесь к нам в увлекательном приключении по поиску сокровищ!</p>
        <%--<a href="#" class="register-btn">Зарегистрироваться</a>--%>
        <link rel="stylesheet" href="../../style.css">
    </header>
    <main>
        <form action="login" method="post">
            <div class="container">
                <label for="username">Логин:</label>
                <input type="text" id="username" name="username" required>
            </div>
            <div class="container">
                <label for="password">Пароль:</label>
                <input type="password" id="password" name="password" required>
            </div>
            <br>
            <input class="register-btn" type="submit" value="Войти">
        </form>

        <%

        %>



    </main>
    <footer>
        <p>&copy; 2021 Квест "Поиск сокровищ". Все права защищены.</p>
    </footer>

</div>
</body>
</html>

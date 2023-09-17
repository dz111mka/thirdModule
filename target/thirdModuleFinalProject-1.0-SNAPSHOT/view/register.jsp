<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>Register</title>
    <link rel="stylesheet" href="../style.css">
</head>

<body>
<div class="wrapper">
    <header>
        <h1>Квест "Поиск сокровищ"</h1>
        <p>Присоединяйтесь к нам в увлекательном приключении по поиску сокровищ!</p>


    </header>
    <main>
        <form action="register" method="post">
            <div class="container">
                <label for="name">Имя:</label>
                <input type="text" id="name" name="name" required>
            </div>
            <div class="container">
                <label for="surname">Фамилия:</label>
                <input type="text" id="surname" name="surname" required>
            </div>
            <div class="container">
                <label for="username">Логин:</label>
                <input type="text" id="username" name="username" required>
            </div>
            <div class="container">
                <label for="password">Пароль:</label>
                <input type="password" id="password" name="password" required>
            </div>
            <div class="container">
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" required>
            </div>
            <br>
            <input class="register-btn" type="submit" value="Зарегистрироваться">
        </form>
    </main>
    <footer>
        <p>&copy; 2023 Квест "Поиск сокровищ". Все права защищены.</p>
    </footer>
</div>
</body>
</html>

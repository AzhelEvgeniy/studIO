<%--
  Created by IntelliJ IDEA.
  User: IOAdmin
  Date: 17.02.2018
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<spring:url var="css" value="/resources/assets/css" />
<spring:url var="js" value="/resources/assets/js" />
<spring:url var="images" value="/resources/assets/images" />

<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <title>Login</title>

    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- bootstrap css -->
    <link rel="stylesheet" href="${css}/bootstrap.min.css">
    <link rel="stylesheet" href="${css}/bootstrap-theme.min.css">

    <!-- my Css -->
    <link rel="stylesheet" href="${css}/sign.css">

</head>
<body>
    <div class="logo">
        <a href="#">
            <img  src="${images}/logo.png" width="170" height="120" alt="logotype">
        </a>
    </div>

    <div class="content">
        <form class="form-login" role="form">
            <h3 class="form-title text-center">Вход в личный кабинет</h3>
            <div class="form-group form-icon">
                <input type="text" class="form-control" placeholder="логин">
                <i class="glyphicon glyphicon-user input-icon" aria-hidden="true"></i>
            </div>
            <div class="form-group form-icon">
                <input type="password" class="form-control" placeholder="пароль">
                <i class="glyphicon glyphicon-lock input-icon" aria-hidden="true"></i>
            </div>
            <div class="form-group form-action">
                <input type="submit" class="btn btn-success btn-block btn-md" value="Войти">
            </div>
        </form>

        <div class="create-account">
            <h4 class="text-center">До сих пор нет аккаунта?</h4>
            <a href="/registration" class="btn btn-primary btn-block">Создать аккаунт</a>
        </div>

        <div class="forgotten-password">
            <h4 class="text-center">Забыл пароль?</h4>
            <p class="text-center">
                нет проблем, нажми <a href="#">сюда</a> для восстановления пароля
            </p>
        </div>
    </div>

    <footer>
        <p class="text-center">2018 &copy; Stud-IO</p>
    </footer>

    <!-- jQuery -->
    <script src="${js}/jquery.min.js"></script>
    <!-- bootstrap js -->
    <script src="${js}/bootstrap.min.js"></script>
</body>
</html>

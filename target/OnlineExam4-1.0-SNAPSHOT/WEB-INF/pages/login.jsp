<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <title>LOGIN PAGE</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- Google Fonts -->
        <link href="<c:url value="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"/>"   type="text/css" >
        <link  href="<c:url value="https://use.fontawesome.com/releases/v5.7.0/css/all.css" />"   type="text/css" rel="stylesheet" >
        <link rel="icon" href="<c:url value="/resources/images/icons/favicon.ico"/>" type="image/png"rel="stylesheet">
        <link  type="text/css" rel="stylesheet" href="<c:url value="/resources/vendor/bootstrap/css/bootstrap.min.css"/>"   >
        <link href="<c:url value="/resources/fonts/font-awesome-4.7.0/css/font-awesome.min.css"/>" rel="stylesheet"  type="text/css">
        <link href="<c:url value="/resources/fonts/Linearicons-Free-v1.0.0/icon-font.min.css"/>" rel="stylesheet"  type="text/css">
        <link href="<c:url value="/resources/vendor/animate/animate.css"/>"  rel="stylesheet" type="text/css">
        <link href="<c:url value="/resources/vendor/css-hamburgers/hamburgers.min.css" />" rel="stylesheet"  type="text/css">
        <link href="<c:url value="/resources/vendor/select2/select2.min.css"/>"  rel="stylesheet" type="text/css">
        <link href="<c:url value="/resources/vendor/daterangepicker/daterangepicker.css" />" rel="stylesheet"  type="text/css">
        <link href="<c:url value="/resources/css/util.css"/>"  rel="stylesheet" type="text/css">
        <link href="<c:url value="/resources/css/main.css"/>"  rel="stylesheet" type="text/css">

    </head>
    <body>

        <div class="limiter">
            <div class="container-login100">
                <div class="wrap-login100">
                    <div class="login100-form-title" style="background-image: url(images/bg-01.jpg);">
                        <span class="login100-form-title-1">
                            Sign In
                        </span>
                    </div>


                    <form method="POST" action="<c:url value='/j_spring_security_login'/>"  id="login-form" name='loginForm' class="login100-form validate-form">


                        <div class="wrap-input100 validate-input m-b-26" data-validate="Username is required">
                            <span class="label-input100">Username</span>
                            <input class="input100" type="text" name="username" placeholder="Enter Username">
                            <span class="focus-input100"></span>
                        </div>

                        <div class="wrap-input100 validate-input m-b-18" data-validate = "Password is required">
                            <span class="label-input100">Password</span>
                            <input class="input100" type="password" name="password" placeholder="Enter password">
                            <span class="focus-input100"></span>
                        </div>      
                        <div class="wrap-input100 validate-input m-b-18" data-validate = "Password is required">

                            <span>${error}</span>
                        </div>      

                        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />

                        <div class="container-login100-form-btn" align="center">

                            <input style="margin-left: 80px ; margin-top: 20px" name="submit" type="submit" value="Login"  class="login100-form-btn" />
                        </div>
                    </form>
                </div>
            </div>
        </div>

        <script src="<c:url value="/resources/vendor/jquery/jquery-3.2.1.min.js"/>"></script>
        <script src="<c:url value="/resources/vendor/animsition/js/animsition.min.js"/>"></script>
        <script src="<c:url value="/resources/vendor/bootstrap/js/popper.js"/>"></script>
        <script src="<c:url value="/resources/vendor/bootstrap/js/bootstrap.min.js"/>"></script>
        <script src="<c:url value="/resources/vendor/select2/select2.min.js"/>"></script>
        <script src="<c:url value="/resources/vendor/daterangepicker/moment.min.js"/>"></script>
        <script src="<c:url value="/resources/vendor/daterangepicker/daterangepicker.js"/>"></script>
        <script src="<c:url value="/resources/vendor/countdowntime/countdowntime.js"/>"></script>
        <script src="<c:url value="/resources/js/main.js"/>"></script>

    </body>
</html>
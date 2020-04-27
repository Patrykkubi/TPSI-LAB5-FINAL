<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Java Web - laboratorium 4</title>
    </head>
    <body>
    
        
        
        <h1>Witaj, <c:out value="${p1.firstName} ${p1.lastName}"/>!</h1>
        
        <!-- W c:out wartosc zostanie odczytana jako ciag znakow -->
        
        <h1>Witaj, ${p1.firstName} ${p1.lastName}!</h1>
        <a href="mailto:${p1.email}">${p1.email}</a>
        <h1>Wyswietlenia strony:${sessionScope.counter} </h1>
        <!--Tutaj wyrazenie zostanie wykonane jako kod html lub js -->
        
        <c:forEach items="${dniTygodnia}" var="dzien">
            <p>
            ${dzien}
            </p>
        </c:forEach>
    </body>
</html>
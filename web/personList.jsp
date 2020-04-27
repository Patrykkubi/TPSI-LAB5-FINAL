<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page session="true" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <table border="1" style="width:100%" >
  <tr>
    <th>Firstname</th>
    <th>Lastname</th>
    <th>Email</th>
  </tr>
  
 

  <c:forEach items="${sessionScope.listaStudentow}" var="Student">
  <tr>
    <td>${Student.firstName}</td>
    <td>${Student.lastName}</td>
    <td>${Student.email}</td>
  </tr>      
            
        </c:forEach>
</table>
        
        <h1>Witamy</h1>
        
        <form action='/lab4/personList' method='post'>
            Przedstaw się ładnie:<br>
         imie <input type='text' name='firstName'><br>
         nazwisko <input type='text' name='lastName'><br>
         email <input type='text' name='email'><br>
         <input type='submit'>
         
         
        </form>
          <h1>Wyswietlenia strony:${sessionScope.counter} </h1>
    </body>
</html>

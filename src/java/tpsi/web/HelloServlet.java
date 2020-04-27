package tpsi.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
 import java.util.List;

@WebServlet(name = "HelloServlet", urlPatterns = {"/hello"})
public class HelloServlet extends HttpServlet {

 
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //response.setContentType("text/html;charset=UTF-8");
       // String imie = request.getParameter("imie");
        Person p1 = new Person(request.getParameter("firstName"),request.getParameter("lastName"),request.getParameter("email"));

        HttpSession session = request.getSession();   
        Integer counter = (Integer) session.getAttribute("counter");
        
        if(counter==null || counter==0){
            counter=1;
        }
        else
        {
        counter++;
        }
        
        session.setAttribute("counter",counter);
        
        List<String> dni = new ArrayList<>();
        dni.add("Poniedziałek");
        dni.add("Wtorek");
        dni.add("Środa");
        dni.add("Czwartek");
        dni.add("Piątek");
        
        
        request.setAttribute("dniTygodnia", dni);
        request.setAttribute("p1", p1);
        request.getRequestDispatcher("hello.jsp").forward(request, response);
    
    
    
}
    
  
    
}
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

@WebServlet(name = "PersonListServlet", urlPatterns = {"/personList"})
public class PersonListServlet extends HttpServlet {

   
     
     protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         

         request.getRequestDispatcher("personList.jsp").forward(request, response);
         
    }
     
     protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
         HttpSession session = request.getSession();         
         
         if (session.getAttribute("listaStudentow")==null){
             List<Student> studenci= new ArrayList<>();
             session.setAttribute("listaStudentow",studenci);
         }
         
         List<Student> studenci =(ArrayList<Student>)session.getAttribute("listaStudentow");
         if (studenci ==null){
             studenci=new ArrayList<>();
         }
         
         Student s1 = new Student(request.getParameter("firstName"),request.getParameter("lastName"),request.getParameter("email"));
         studenci.add(s1);
      
         request.getRequestDispatcher("personList.jsp").forward(request, response);
     }

}

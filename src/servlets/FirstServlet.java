package servlets;

import servlets.com.demo.Student;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class FirstServlet extends HttpServlet{
    public void doGet(HttpServletRequest request,HttpServletResponse response)
            throws IOException,ServletException{
        String usersno = request.getParameter("usersno");
        String username = request.getParameter("username");
        Student student = new Student();
        student.setno(usersno);
        student.setname(username);

        String forward;
        request.setAttribute("stu", student);
       forward = "/login1";
       RequestDispatcher dispatcher = request.getRequestDispatcher(forward);
        dispatcher.forward(request,response);
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response)
            throws IOException,ServletException{
        doGet(request,response);
    }
}

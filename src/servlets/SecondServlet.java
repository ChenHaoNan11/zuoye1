package servlets;

import servlets.com.demo.Student;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class SecondServlet extends HttpServlet{
    public void doGet(HttpServletRequest request,HttpServletResponse response)
            throws IOException,ServletException{

        Student student = (Student)request.getAttribute("stu");

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<title>作业1</title>");
        out.println("</head><body>");
        out.println("学号："+student.getno()+"<br>");
        out.println("姓名："+student.getname()+"<br>");
        out.println("<a href='http://localhost:8080/'>返回输入页面</a>");
        out.println("</body></html>");
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response)
            throws IOException,ServletException{
        doGet(request,response);
    }
}

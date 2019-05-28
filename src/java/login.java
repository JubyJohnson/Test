/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class login extends HttpServlet {

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           String Email= request.getParameter("t1");
           String Password= request.getParameter("t2");
           if(Email!= null && Password !=null)
           {
                RequestDispatcher req = request.getRequestDispatcher("index.html");
            req.include(request, response);
               }else{
                    RequestDispatcher req = request.getRequestDispatcher("Login.html");
            req.include(request, response);
                   
               }
               
          
        }
    }

   
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       doGet(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}

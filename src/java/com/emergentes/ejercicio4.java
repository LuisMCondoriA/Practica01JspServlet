
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author wwwsd
 */
@WebServlet(name = "ejercicio4", urlPatterns = {"/ejercicio4"})
public class ejercicio4 extends HttpServlet {

        @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Calcular edad</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1><center>Servlet para simular el lanzamiento de dos dados</center></h1>");
            out.println("<br><br>");
            out.println("<h3>Regla principal si la suma es 7 u 11 gana si es otro numero pierde</h3>");
            
            out.println("<form action='' method='post'>");
            out.println("<input type='submit' value='Lanzar los dados'>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
        
    }
   
        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Random na = new Random();
        int n2 = na.nextInt(6)+1;
        Random n = new Random();
        int n1 = n.nextInt(6)+1;
        int a;
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Calcular edad</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1><center>Servlet para simular el lanzamiento de dos dados</center></h1>");
            out.println("<br><br>");
            out.println("<h3>Regla principal si la suma es 7 u 11 gana si es otro numero pierde</h3>");
            out.println("El primer dado es "+n1);    
            out.println(" el segundo dado es "+n2);
            out.println("<br>");
            a=n1+n2;
            if(a==7 || a==11){
                out.println("El resultado es "+a);
                out.println("<center><p>Usted GANO!!!!</p></center>");
            }else {
                out.println("El resultado es "+a);
                out.println("<center><p>Usted PERDIO!!!!</p></center>");
            }
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
        
    }   
 
}

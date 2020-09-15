
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author wwwsd
 */
@WebServlet(name = "ejercicio3", urlPatterns = {"/ejercicio3"})
public class ejercicio3 extends HttpServlet {

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
            out.println("<h1><center>Servlet para calcular una operacion aritmetica</center></h1>");
            out.println("<br><br>");
            out.println("<form action='' method='post'>");
            out.println("Introdusca sus valores:");
            out.println("<input type='number' name='n1' step='any' required>");       
            out.println("<select name='op' id='op'>");
            out.println("<option value='1'>+</option>");
            out.println("<option value='2'>-</option>");
            out.println("<option value='3'>*</option>");
            out.println("<option value='4'>/</option>");
            out.println("<input type='number' name='n2' step='any' required>");  
            out.println("<input type='submit' value='Procesar'>");
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
        String n1 = request.getParameter("n1");
        double na = Double.parseDouble(n1);
        String n2 = request.getParameter("n2");
        double nb = Double.parseDouble(n2);
        String op = request.getParameter("op");
        int ope = Integer.parseInt(op);
        double a;
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Calcular edad</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1><center>Servlet para calcular edad</center></h1>");
            out.println("<br><br>");
                if (na >= 0){
                    if(ope == 1){
                        a=na+nb;
                    }else{
                        if(ope == 2){
                            a=na-nb;
                        }else{
                            if(ope == 3){
                                a=na*nb;
                            } else{
                                a=na/nb;
                            }
                        }
                    }    
                    out.println("<h3>El resultado es : </h3>"+a);
                    
                } else {
                    out.println("No hay datos que mostrar");
                }
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
        
    }
}


package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ejercicio1", urlPatterns = {"/ejercicio1"})
public class ejercicio1 extends HttpServlet {
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
            out.println("<h1><center>Servlet para calcular edad</center></h1>");
            out.println("<br><br>");
            out.println("<form action='' method='post'>");
            out.println("Introdusca el año de nacimiento:");
            out.println("<input type='number' name='edad' required>");
            out.println("<br>");
            out.println("<input type='submit' value='Enviar'>");
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
        String edad = request.getParameter("edad");  //combierto a entero por que solo parece que puedo                                                     
        int edadn = Integer.parseInt(edad);          //recibir cadenas
        int edadf;
        Calendar fecha = Calendar.getInstance();  //obtengo fecha del sistema
        int año= fecha.get(Calendar.YEAR);
        
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
                if (edadn >= 0){
                    edadf=año-edadn;
                    out.println("<h3>Su edad es : </h3>"+edadf);
                    
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

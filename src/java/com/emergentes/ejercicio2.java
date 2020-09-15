
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
@WebServlet(name = "ejercicio2", urlPatterns = {"/ejercicio2"})
public class ejercicio2 extends HttpServlet {

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
            out.println("<h1><center>Servlet para convertir moneda</center></h1>");
            out.println("<br><br>");
            out.println("<p>Cotizacion del dolar</p>");
            out.println("<p>1 dolar estadounidense es igual a 6.91 bolivianos</p>");
            out.println("<form action='' method='post'>");
            out.println("Introdusca su monto:");
            out.println("<input type='number' name='monto' step='any' required>");
            out.println("<br>");
            out.println("Seleccione el tipo de moneda:");        
            out.println("<select name='cambio' id='cambio'>");
            out.println("<option value='1'>Bolivianos</option>");
            out.println("<option value='2'>Dolar</option>");
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
        String monto = request.getParameter("monto");  //combierto a entero por que solo parece que puedo                                                     
        double monton = Double.parseDouble(monto);
        String c;
        String cambio = request.getParameter("cambio");
        int cambion = Integer.parseInt(cambio);
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
                if (monton >= 0){
                    if(cambion == 1){
                        a=monton/6.91;
                        c="Dolares";
                    }else{
                        a=monton*6.91;
                        c="Bolivianos";
                    }    
                    out.println("<h3>Su monto es : </h3>"+a+" "+c);
                    
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

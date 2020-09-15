
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ejercicio5", urlPatterns = {"/ejercicio5"})
public class ejercicio5 extends HttpServlet {

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
            out.println("<h1><center>Servlet que genera la matriz caracol</center></h1>");
            out.println("<br><br>");
            out.println("<form action='' method='post'>");
            out.println("Ingrese un numero");
            out.println("<input type='number' name='num' required>");
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
        String a1 = request.getParameter("num");
        int n = Integer.parseInt(a1);
        int x=1,a=0,b=n,c=n*n,i=0,m[][],j;
        m = new int [n][n];
      while(x<=c){
            for(j=a;j<b;j++){
               m[i][j]=x;
               x=x+1;
            }
            for(i=a+1;i<b;i++){
                m[i][j-1]=x;
                x=x+1;
            }
            for(j=b-1;j>a;j=j-1){
                m[i-1][j-1]=x;
                x=x+1;
            }
            for(i=b-1;i>a+1;i=i-1){
                m[i-1][j]=x;
                x=x+1;
            }
            a=a+1;
            b=b-1;
        }
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Calcular edad</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1><center>Servlet que genera la matriz caracol</center></h1>");
            out.println("<br><br>");
            out.println("<table border='2' frame='border'>");
            for(int y=0;y<n;y++){
                out.println("<tr>");
                for(int z=0;z<n;z++){

                    out.println("<td>"+m[y][z]+"</td>");
                }
                out.println("</tr>");
            }
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
        
    }   
 
}

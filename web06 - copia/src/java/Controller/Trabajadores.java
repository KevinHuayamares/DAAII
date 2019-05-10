/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Modelo.Trabajador;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author KHUAYAMARESC
 */
@WebServlet(name = "Trabajadores", urlPatterns = {"/trabajadores"})
public class Trabajadores extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Problema 11</title>");            
            out.println("</head>");
            out.println("<body>");
            
//RECOGEMOS LOS DATOS QUE VIENEN DESDE LA JSP
//Declaramos las variables:          
String nombre, cat, fechaIn, d, m, a;
int horasN, horasE;
double desc1=0, desc2=0, desc3=0, descuento, tarifaHN=0, tarifaHE=0;
double sBasico, sNeto;
        
//asignamos el valor a las variables
nombre = request.getParameter("nombre");
cat = request.getParameter("rbCat");
d = request.getParameter("cboDia");
m = request.getParameter("cboMes");
a = request.getParameter("cboAnio");
horasN  = Integer.parseInt(request.getParameter("txtHorasN"));
horasE  = Integer.parseInt(request.getParameter("txtHorasE"));
if(request.getParameter("chk2") != null) desc1=0.02;
if(request.getParameter("chk6") != null) desc2=0.06;
if(request.getParameter("chk10") != null) desc3=0.10;

//Operaciones Matematicas y Lógica
fechaIn = d +"/"+ m +"/"+ a; //formato DATE de MySQL

if(cat.equals("A")){
    tarifaHN = 20;
    tarifaHE = 30;
}
if(cat.equals("B")){
    tarifaHN = 30;
    tarifaHE = 45;
}
if(cat.equals("C")){
    tarifaHN = 40;
    tarifaHE = 60;
}

sBasico = horasN*tarifaHN + horasE*tarifaHE;
descuento = (desc1 + desc2 + desc3)*sBasico;
sNeto = sBasico - descuento;



//AGREGAMOS LAS VARIABLES AL OBJETO BEANS
//1. Creamos el ArrayList
ArrayList<Trabajador> lista = new ArrayList<Trabajador>();
//2. Instanciamos el Beans
Trabajador t = new Trabajador();
//3. Agregamos las variables al Bean
t.setNombres(nombre);
t.setFecha(fechaIn);
t.setCategoria(cat);
t.setHorasT(horasN);
t.setHorasE(horasE);
t.setPagoHN(tarifaHN);
t.setPagoHE(tarifaHE);
t.setSueldoB(sBasico);
t.setDescuento(descuento);
t.setNeto(sNeto);
//4. Agrgamos el Beans al ArrayList
lista.add(t);


//MOSTRAMOS LOS RESULTADOS EN UNA TABLA

out.println("<table border='1'>");
    out.println("<TR>");
        out.println("<td>COD.</td>");
        out.println("<td>NOMBRES</td>");
        out.println("<td>FECHA ING.</td>");
        out.println("<td>CAT.</td>");
        out.println("<td>TOTAL H.N.</td>");
        out.println("<td>TOTAL H.E.</td>");
        out.println("<td>PAGO H.N.</td>");
        out.println("<td>PAGO H.E.</td>");
        out.println("<td>S. BASICO</td>");
        out.println("<td>DESCUENTO</td>");
        out.println("<td>NETO</td>");
    out.println("</TR>");                

    out.println("<TR>");
        
        out.println("<td>"+lista.get(0).getNombres()+"</td>");
        out.println("<td>"+lista.get(0).getFecha()+"</td>");
        out.println("<td>"+lista.get(0).getCategoria()+"</td>");
        out.println("<td>"+lista.get(0).getHorasT()+"</td>");          
        out.println("<td>"+lista.get(0).getHorasE()+"</td>");          
        out.println("<td>"+lista.get(0).getPagoHN()+"</td>");          
        out.println("<td>"+lista.get(0).getPagoHE()+"</td>");          
        out.println("<td>"+lista.get(0).getSueldoB()+"</td>");           
        out.println("<td>"+lista.get(0).getDescuento()+"</td>");           
        out.println("<td>"+lista.get(0).getNeto()+"</td>");           
    out.println("</TR>");
    
out.println("</table>"); 

          
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

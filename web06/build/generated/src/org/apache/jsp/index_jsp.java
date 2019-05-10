package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Web del Trabajador</title>\n");
      out.write("        <link href=\"css/estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <hr size=\"10\" color=\"green\">\n");
      out.write("        \n");
      out.write("        <div class=\"principal\">\n");
      out.write("            <nav class=\"menu\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"index.jsp\">Inicio</a></li>\n");
      out.write("                    <li><a href=\"index.jsp\">Trabajadores</a></li>\n");
      out.write("                    <li><a href=\"index.jsp\">Contacto</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("            \n");
      out.write("            <section>\n");
      out.write("                <form action=\"Trabajadores\" method=\"post\">\n");
      out.write("                    <input type=\"text\" name=\"nombre\" placeholder=\"Nombres\">\n");
      out.write("                    <label>Categoría</label>\n");
      out.write("                    <input type=\"radio\" name=\"cat\" value=\"A\">a\n");
      out.write("                    <input type=\"radio\" name=\"cat\" value=\"B\">b\n");
      out.write("                    <input type=\"radio\" name=\"cat\" value=\"C\">c\n");
      out.write("                    \n");
      out.write("                    <label>Fecha de inicio</label>\n");
      out.write("                    <select name=\"dia\">\n");
      out.write("                        \n");
      out.write("                        ");
for(int i=1;i<=31;i++){
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</option>  \n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                    \n");
      out.write("                    <select name=\"mes\">\n");
      out.write("                        <option value=\"Enero\">Enero</option>\n");
      out.write("                        <option value=\"Febrero\">Febrero</option>\n");
      out.write("                        <option value=\"Marzo\">Marzo</option>\n");
      out.write("                        <option value=\"Abril\">Abril</option>\n");
      out.write("                        <option value=\"Mayo\">Mayo</option>\n");
      out.write("                        <option value=\"Junio\">Junio</option>\n");
      out.write("                        <option value=\"Julio\">Julio</option>\n");
      out.write("                        <option value=\"Agosto\">Agosto</option>\n");
      out.write("                        <option value=\"Setiembre\">Setiembre</option>\n");
      out.write("                        <option value=\"Octubre\">Octubre</option>\n");
      out.write("                        <option value=\"Noviembre\">Noviembre</option>\n");
      out.write("                        <option value=\"Diciembre\">Diciembre</option>\n");
      out.write("                    </select>\n");
      out.write("                    \n");
      out.write("                     <select name=\"anio\">\n");
      out.write("                        ");
for(int i=1980;i<=2019;i++){
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</option>  \n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                    \n");
      out.write("                    <label>Horas Trabajadas</label>\n");
      out.write("                    <input type=\"text\" name=\"horasT\" placeholder=\"horas Trabajadas\">\n");
      out.write("                    <input type=\"text\" name=\"horasE\" placeholder=\"horas Extras\">\n");
      out.write("                    \n");
      out.write("                    <label>Descuentos</label>\n");
      out.write("                    <input type=\"checkbox\" name=\"ckh2\" value=\"ON\">2%\n");
      out.write("                    <input type=\"checkbox\" name=\"ckh6\" value=\"ON\">6%\n");
      out.write("                    <input type=\"checkbox\" name=\"ckh10\" value=\"ON\">10%\n");
      out.write("                    \n");
      out.write("                    <input type=\"submit\" value=\"Enviar\" class=\"btn\">\n");
      out.write("                        \n");
      out.write("                </form>\n");
      out.write("            </section>\n");
      out.write("                    \n");
      out.write("            <footer>\n");
      out.write("                <h2>Elaborado por Huayamares Carbajal Kevin</h2>\n");
      out.write("                <p>Desarrollador Web</p>\n");
      out.write("            </footer>\n");
      out.write("                        \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

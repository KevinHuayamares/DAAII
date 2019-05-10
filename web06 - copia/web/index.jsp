<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Web del Trabajador</title>
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <hr size="10" color="green">
        
        <div class="principal">
            <nav class="menu">
                <ul>
                    <li><a href="index.jsp">Inicio</a></li>
                    <li><a href="index.jsp">Trabajadores</a></li>
                    <li><a href="index.jsp">Contacto</a></li>
                </ul>
            </nav>
            
            <section>
                <form action="Trabajadores" method="post">
                    <input type="text" name="nombre" placeholder="Nombres">
                    <label>Categoría</label>
                    <input type="radio" name="cat" value="A">a
                    <input type="radio" name="cat" value="B">b
                    <input type="radio" name="cat" value="C">c
                    
                    <label>Fecha de inicio</label>
                    <select name="dia">
                        
                        <%for(int i=1;i<=31;i++){%>
                            <option value="<%=i%>"><%=i%></option>  
                        <%}%>
                    </select>
                    
                    <select name="mes">
                        <option value="Enero">Enero</option>
                        <option value="Febrero">Febrero</option>
                        <option value="Marzo">Marzo</option>
                        <option value="Abril">Abril</option>
                        <option value="Mayo">Mayo</option>
                        <option value="Junio">Junio</option>
                        <option value="Julio">Julio</option>
                        <option value="Agosto">Agosto</option>
                        <option value="Setiembre">Setiembre</option>
                        <option value="Octubre">Octubre</option>
                        <option value="Noviembre">Noviembre</option>
                        <option value="Diciembre">Diciembre</option>
                    </select>
                    
                     <select name="anio">
                        <%for(int i=1980;i<=2019;i++){%>
                            <option value="<%=i%>"><%=i%></option>  
                        <%}%>
                    </select>
                    
                    <label>Horas Trabajadas</label>
                    <input type="text" name="horasT" placeholder="horas Trabajadas">
                    <input type="text" name="horasE" placeholder="horas Extras">
                    
                    <label>Descuentos</label>
                    <input type="checkbox" name="ckh2" value="ON">2%
                    <input type="checkbox" name="ckh6" value="ON">6%
                    <input type="checkbox" name="ckh10" value="ON">10%
                    
                    <input type="submit" value="Enviar" class="btn">
                        
                </form>
            </section>
                    
            <footer>
                <h2>Elaborado por Huayamares Carbajal Kevin</h2>
                <p>Desarrollador Web</p>
            </footer>
                        
        </div>
        
    </body>
</html>

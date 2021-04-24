<%-- 
    Document   : ranking
    Created on : 23/04/2021, 15:55:23
    Author     : Stefany
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="Regras.Conexaobd"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ranking de Jogadores</h1>
        <%

            try {
                Conexaobd cn = new Conexaobd();
                
                cn.getConexao();
                
                ResultSet rs = cn.LerDados();

                while (rs.next()) {
                    /*out.print(rs.getInt("cod") + " | ");*/
                    out.print(rs.getString("apelido") + " | ");
                    out.print(rs.getString("pontos") + "<br>");
                }
                /*out.println("</div>");*/
                cn.desconectar();
            } catch (Exception ex) {
                out.print(ex.getMessage());
                /*response.sendRedirect("TrataErro.jsp?errocad = " + Conectar.status);*/
            }
        %> 
    </body>
</html>

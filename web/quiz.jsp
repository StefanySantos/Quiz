<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page  import="Regras.Conexaobd" %>
<%@page  import="Regras.ExecutaProblemas" %>
<jsp:useBean id="executaProblemas" class="Regras.ExecutaProblemas" scope="session"/>
<jsp:useBean id="conexaobd" class="Regras.Conexaobd" scope="session"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <%
            if (request.getAttribute("executaProblemas") != null) {
                executaProblemas = (ExecutaProblemas) request.getAttribute("executaProblemas");
            }
        %>
        <h1>Quiz De Sequencia numerica</h1>
        <br>
        <%if (executaProblemas.getScore() > 0) {%>
        <p>Seu score é:<%=executaProblemas.getScore()%></p>
        <%} %>
        <p>Sequencia = { 
            <%
                int[] numeros = executaProblemas.getProblemaNumerico().getNumeros();
                for (int i = 0; i < numeros.length; i++) {
                if (1 < (numeros.length - 1)) {%>
            <%=numeros[i]%>,
            <%
            } else {%>
            <%=numeros[i]%>

            <%

                    }

                }

            %>


            }</p>

        <form action="QuizController"  method="get">

            <table>
                <tr>

                    <td>seu apelido:<%=conexaobd.getApelido()%></td>
                    <td></td>
                </tr>
                <tr>

                    <td>Qual é a sua solução</td>
                    <td><input type="text" name="solucao"/></td>
                </tr>
                <tr>
                    <td><input type="text" name="posicao" value="<%=executaProblemas.getPosicaoAtual()%>"</td>
                    <td><input type="submit" value="Checar"/></td>
                </tr>                
            </table>
        </form>
    </body>
</html>

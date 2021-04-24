
<%@page  import="Regras.Conexaobd" %>
<jsp:useBean id="conexaobd" class="Regras.Conexaobd" scope="session"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
        <h1>Hello World!</h1>
        <form action="QuizLog" method="get">
            informe seu apelido: <input type="text" name="apelido" value=""/><br>
            <input type="submit" name="inicar" value="iniciar"/>
        
        </form>  
        
          
          
          
         <a href="quiz.jsp">Quiz</a>
        <a href="ranking.jsp">Ranking do quiz</a>
        
    
</html>

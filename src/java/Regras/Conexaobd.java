package Regras;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexaobd {

    public static String status = "Não conectou....";

    String apelido;
    int score;

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public static java.sql.Connection conexao = null;

    public static java.sql.Connection Conexaobd() {
        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=brasileiro";
            conexao = DriverManager.getConnection(url, "Testebd", "teste123");

        } catch (Exception e) {
            e.getMessage();
        }
        return conexao;
    }

    public Connection getConexao() {
        return conexao;
    }

    public void desconectar() {
        try {
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexaobd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean insertPontos(int pontos) {
        try {
            getConexao();

            PreparedStatement prepared = conexao.prepareStatement("insert into pontos values ('" + pontos + "');");

            prepared.execute();

            desconectar();
            return true;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Conexaobd.class.getName()).log(Level.SEVERE, null, ex);
            // status = ("Erro: " + ex.getMessage());
            return false;
        }
    }

    public boolean insertApelido(String apelido) {
        try {
            getConexao();

            PreparedStatement prepared = conexao.prepareStatement("insert into apelido values ('" + apelido + "');");

            prepared.execute();

            desconectar();
            return true;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Conexaobd.class.getName()).log(Level.SEVERE, null, ex);
            // status = ("Erro: " + ex.getMessage());
            return false;
        }
    }

    public ResultSet LerDados() {

        try {
            Conexaobd();
            Statement stmt;
            stmt = conexao.createStatement();
            String query = "select apelido.apelido as apelido, pontos.pontos as pontos from pontos join apelido on pontos.cod = apelido.codigo order by pontos.pontos desc";
            ResultSet rs = stmt.executeQuery(query);

            return rs;
        } catch (SQLException ex) {
            status = "Erro:" + ex.getMessage();
            return null;
        }
    }

}

package com.rh.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ModuloConexao {
    
    public static Connection conector(){
        Connection conexao = null;
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://127.0.0.1/bdrhext?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "pmbbetim";
            //String password = "wft69FT69@@";
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Erro ao conectar o Banco de Dados!!" + erro.getMessage());
            return null;
        }        
    }
}

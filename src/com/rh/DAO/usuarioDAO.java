
package com.rh.DAO;

import com.rh.conexao.ModuloConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.rh.DTO.usuarioDTO;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class usuarioDAO {
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public void cadastrarUsuario(usuarioDTO usu){
        String sql = "insert into tblusuarios(usuario,login,senha,perfil,datacad,administrador) values (?,?,?,?,?,?)";
        conexao = ModuloConexao.conector();
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1,usu.getUsuario().toUpperCase());
            pst.setString(2,usu.getLogin());
            pst.setString(3,usu.getSenha());
            pst.setString(4,usu.getPerfil());
            pst.setString(5,usu.getDatacad());
            pst.setString(6,usu.getAdmin().toUpperCase());
            int adicionado = pst.executeUpdate();
            if(adicionado >0){
                JOptionPane.showMessageDialog(null,"Usuário cadastrado com sucesso!!");
                pst.close();
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"Erro ao Cadastrar Usuário!!" + erro.getMessage());
        }
        
    }
    
    public void excluirUsuario(usuarioDTO usu){
        int exclui = JOptionPane.showConfirmDialog(null,"Tem certeza que deseja EXCLUIR este usuário?" ,"ATENÇÃO!!",JOptionPane.YES_NO_OPTION);
        if(exclui == JOptionPane.YES_OPTION){
            String sql = "delete from tblusuarios where idusu = ?";
            conexao = ModuloConexao.conector();
            try {
                pst = conexao.prepareStatement(sql);
                pst.setInt(1,usu.getIdusu());
                int excluido = pst.executeUpdate();
                if(excluido >0){
                    JOptionPane.showMessageDialog(null,"Usuário excluído com Sucesso!!!");
                }
            } catch (HeadlessException | SQLException erro) {
                JOptionPane.showMessageDialog(null,"Erro ao Excluir UsuárioDAO!!" +erro.getMessage());
            }
        }
        
    }
    

}

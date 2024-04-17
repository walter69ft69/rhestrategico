
package com.rh.views;

import com.rh.DAO.usuarioDAO;
import com.rh.DTO.ModeloTabela;
import com.rh.DTO.usuarioDTO;
import com.rh.conexao.ModuloConexao;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;


public class TelaUsuarios extends javax.swing.JInternalFrame {
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

  
    public TelaUsuarios() throws SQLException {
        initComponents();        
        conexao = ModuloConexao.conector();
        desabilitar();
        preencherTabela("select * from tblusuarios order by usuario");
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIdUsu = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblLogUsu = new javax.swing.JLabel();
        lblSenUsu = new javax.swing.JLabel();
        lblPerUsu = new javax.swing.JLabel();
        lblDatCadUsu = new javax.swing.JLabel();
        lblResCadUsu = new javax.swing.JLabel();
        txtResCadUsu = new javax.swing.JTextField();
        txtIdUsu = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtLogUsu = new javax.swing.JTextField();
        txtDatCadUsu = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuario = new javax.swing.JTable();
        cmbPerUsu = new javax.swing.JComboBox<>();
        btnLimparUsu = new javax.swing.JButton();
        btnNovoUsu = new javax.swing.JButton();
        btnSalvarUsu = new javax.swing.JButton();
        btnEditarUsu = new javax.swing.JButton();
        btnExcluirUsu = new javax.swing.JButton();
        txtSenUsu = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIdUsu.setBackground(new java.awt.Color(255, 255, 255));
        lblIdUsu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblIdUsu.setText("Código do Usuário");
        getContentPane().add(lblIdUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 175, 25));

        lblUsuario.setBackground(new java.awt.Color(255, 255, 255));
        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUsuario.setText("Usuário");
        getContentPane().add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 75, 175, 25));

        lblLogUsu.setBackground(new java.awt.Color(255, 255, 255));
        lblLogUsu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblLogUsu.setText("Login");
        getContentPane().add(lblLogUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 175, 25));

        lblSenUsu.setBackground(new java.awt.Color(255, 255, 255));
        lblSenUsu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSenUsu.setText("Senha");
        getContentPane().add(lblSenUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 165, 175, 25));

        lblPerUsu.setBackground(new java.awt.Color(255, 255, 255));
        lblPerUsu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPerUsu.setText("Perfil");
        getContentPane().add(lblPerUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 175, 25));

        lblDatCadUsu.setBackground(new java.awt.Color(255, 255, 255));
        lblDatCadUsu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDatCadUsu.setText("Data do Cadastro");
        getContentPane().add(lblDatCadUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 255, 175, 25));

        lblResCadUsu.setBackground(new java.awt.Color(255, 255, 255));
        lblResCadUsu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblResCadUsu.setText("Responsável pelo Cadastro");
        getContentPane().add(lblResCadUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 175, 25));

        txtResCadUsu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtResCadUsu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));
        getContentPane().add(txtResCadUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 380, 25));

        txtIdUsu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtIdUsu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));
        getContentPane().add(txtIdUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 120, 25));

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 75, 380, 25));

        txtLogUsu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtLogUsu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));
        getContentPane().add(txtLogUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 380, 25));

        txtDatCadUsu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDatCadUsu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));
        getContentPane().add(txtDatCadUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 255, 150, 25));

        tblUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsuario);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 1220, 290));

        cmbPerUsu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbPerUsu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "master", "user", "admin" }));
        cmbPerUsu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));
        getContentPane().add(cmbPerUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 170, 25));

        btnLimparUsu.setBackground(new java.awt.Color(255, 255, 255));
        btnLimparUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rh/imagens/limparpeq.jpg"))); // NOI18N
        btnLimparUsu.setText("Limpar");
        btnLimparUsu.setToolTipText("");
        btnLimparUsu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));
        btnLimparUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparUsuActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimparUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 700, 120, 45));

        btnNovoUsu.setBackground(new java.awt.Color(255, 255, 255));
        btnNovoUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rh/imagens/createpeq.jpg"))); // NOI18N
        btnNovoUsu.setText("Novo");
        btnNovoUsu.setToolTipText("");
        btnNovoUsu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));
        btnNovoUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoUsuActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovoUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 700, 120, 45));

        btnSalvarUsu.setBackground(new java.awt.Color(255, 255, 255));
        btnSalvarUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rh/imagens/salvo1peq.jpg"))); // NOI18N
        btnSalvarUsu.setText("Salvar");
        btnSalvarUsu.setToolTipText("");
        btnSalvarUsu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));
        btnSalvarUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarUsuActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvarUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 700, 120, 45));

        btnEditarUsu.setBackground(new java.awt.Color(255, 255, 255));
        btnEditarUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rh/imagens/uploadpeq.jpg"))); // NOI18N
        btnEditarUsu.setText("Editar");
        btnEditarUsu.setToolTipText("");
        btnEditarUsu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));
        getContentPane().add(btnEditarUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 700, 120, 45));

        btnExcluirUsu.setBackground(new java.awt.Color(255, 255, 255));
        btnExcluirUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rh/imagens/deletepeq.jpg"))); // NOI18N
        btnExcluirUsu.setText("Excluir");
        btnExcluirUsu.setToolTipText("");
        btnExcluirUsu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));
        getContentPane().add(btnExcluirUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 700, 120, 45));

        txtSenUsu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSenUsu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));
        getContentPane().add(txtSenUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 165, 380, 25));

        setBounds(0, 0, 1279, 838);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoUsuActionPerformed
        novo();
    }//GEN-LAST:event_btnNovoUsuActionPerformed

    private void btnSalvarUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarUsuActionPerformed
        cadastrarUsuario();
    }//GEN-LAST:event_btnSalvarUsuActionPerformed

    private void tblUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuarioMouseClicked
        setarCampos(); 
        btnSalvarUsu.setEnabled(false);
        btnLimparUsu.setEnabled(true);
    }//GEN-LAST:event_tblUsuarioMouseClicked

    private void btnLimparUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparUsuActionPerformed
        limpar();
    }//GEN-LAST:event_btnLimparUsuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarUsu;
    private javax.swing.JButton btnExcluirUsu;
    private javax.swing.JButton btnLimparUsu;
    private javax.swing.JButton btnNovoUsu;
    private javax.swing.JButton btnSalvarUsu;
    private javax.swing.JComboBox<String> cmbPerUsu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDatCadUsu;
    private javax.swing.JLabel lblIdUsu;
    private javax.swing.JLabel lblLogUsu;
    private javax.swing.JLabel lblPerUsu;
    private javax.swing.JLabel lblResCadUsu;
    private javax.swing.JLabel lblSenUsu;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTable tblUsuario;
    private javax.swing.JTextField txtDatCadUsu;
    private javax.swing.JTextField txtIdUsu;
    private javax.swing.JTextField txtLogUsu;
    private javax.swing.JTextField txtResCadUsu;
    private javax.swing.JPasswordField txtSenUsu;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

        
    public void novo(){
        habilitar();
        limpar();
        dataatual();
        txtUsuario.requestFocus();
        txtResCadUsu.setText(System.getProperty("user.name"));
    }
    
    public void cadastrarUsuario(){
        String usuario,login,senha,perfil,datacad,rescad;
        
        usuario = txtUsuario.getText();
        login = txtLogUsu.getText();
        senha = txtSenUsu.getText();
        perfil = cmbPerUsu.getSelectedItem().toString();        
        datacad = txtDatCadUsu.getText();
        rescad = txtResCadUsu.getText();
        
        usuarioDTO usu = new usuarioDTO();
        usu.setUsuario(usuario);
        usu.setLogin(login);
        usu.setSenha(senha);
        usu.setPerfil(perfil);
        Date data = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
        formato.applyPattern("yyyy/MM/dd");
        usu.setDatacad(formato.format(data));
        usu.setAdmin(login);
        
        usuarioDAO usudao = new usuarioDAO();
        usudao.cadastrarUsuario(usu);
        try {
            limpar();
            desabilitar();
            preencherTabela("select * from tblusuarios order by usuario");
            btnSalvarUsu.setEnabled(false);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar usuário!!!" + erro.getMessage());
        }        
    }
    
    public void excluirUsuario(){
        int iduser;
                
        iduser = Integer.parseInt(txtIdUsu.getText());
        
        usuarioDTO usu = new usuarioDTO();
        usu.setIdusu(iduser);
        
        usuarioDAO usudao = new usuarioDAO();
        usudao.excluirUsuario(usu);
        try {
            preencherTabela("select * from tblusuarios order by usuario");
            pst.close();
            limpar();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"Erro ao Excluir Usuário!!" +erro.getMessage());
        }
        
        
        
    }
    public void habilitar(){
        txtUsuario.setEnabled(true);
        txtLogUsu.setEnabled(true);
        txtLogUsu.setEnabled(true);
        cmbPerUsu.setEnabled(true);
        txtDatCadUsu.setEnabled(true);
        txtResCadUsu.setEnabled(true);
        txtIdUsu.setBackground(new Color(255,255,255));
        txtUsuario.setBackground(new Color(255,255,255));
        txtLogUsu.setBackground(new Color(255,255,255));
        txtSenUsu.setBackground(new Color(255,255,255));
        cmbPerUsu.setBackground(new Color(255,255,255));
        txtDatCadUsu.setBackground(new Color(255,255,255));
        txtResCadUsu.setBackground(new Color(255,255,255));
        btnSalvarUsu.setEnabled(true);
        btnEditarUsu.setEnabled(false);
        btnExcluirUsu.setEnabled(false);
        btnLimparUsu.setEnabled(false);
    }
    
    public void desabilitar(){
        txtIdUsu.setEnabled(false);
        txtUsuario.setEnabled(false);
        txtLogUsu.setEnabled(false);
        txtLogUsu.setEnabled(false);
        cmbPerUsu.setEnabled(false);
        txtDatCadUsu.setEnabled(false);
        txtResCadUsu.setEnabled(false);
        txtIdUsu.setBackground(new Color(190,190,190));
        txtUsuario.setBackground(new Color(190,190,190));
        txtLogUsu.setBackground(new Color(190,190,190));
        txtSenUsu.setBackground(new Color(190,190,190));
        cmbPerUsu.setBackground(new Color(190,190,190));
        txtDatCadUsu.setBackground(new Color(190,190,190));
        txtResCadUsu.setBackground(new Color(190,190,190));
        btnSalvarUsu.setEnabled(false);
        btnEditarUsu.setEnabled(false);
        btnExcluirUsu.setEnabled(false);
        btnLimparUsu.setEnabled(false);        
    }
    
    public void limpar(){
        txtIdUsu.setText("");
        txtUsuario.setText("");
        txtLogUsu.setText("");
        txtSenUsu.setText("");
        cmbPerUsu.setSelectedIndex(-1);
        txtDatCadUsu.setText("");
        txtResCadUsu.setText("");
    }
    
    public void preencherTabela(String SQL)throws SQLException{
        ArrayList dados = new ArrayList();
        String[]Colunas = new String[]{"CÓDIGO USUÁRIO","USUÁRIO","LOGIN","SENHA","PERFIL","DATA CADASTRO","RESPONSÁVEL PELO CADASTRO"};
        pst = conexao.prepareStatement(SQL);
        rs = pst.executeQuery();
        try {
            if(rs.next())
                do{
                    dados.add(new Object[]{rs.getInt("iduser"),rs.getString("usuario"),rs.getString("login"),
                    rs.getString("senha"),rs.getString("perfil"),rs.getString("datacad"),rs.getString("administrador")});
                }while(rs.next());
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Erro ao Carregar ArrayList Usuarios!!" + erro.getMessage());
        }
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        tblUsuario.setModel(modelo);
        tblUsuario.getColumnModel().getColumn(0).setPreferredWidth(10);
        tblUsuario.getColumnModel().getColumn(0).setResizable(false);
        tblUsuario.getColumnModel().getColumn(1).setPreferredWidth(200);
        tblUsuario.getColumnModel().getColumn(1).setResizable(false);
        tblUsuario.getColumnModel().getColumn(2).setPreferredWidth(200);
        tblUsuario.getColumnModel().getColumn(2).setResizable(false);
        tblUsuario.getColumnModel().getColumn(3).setPreferredWidth(200);
        tblUsuario.getColumnModel().getColumn(3).setResizable(false);
        tblUsuario.getColumnModel().getColumn(4).setPreferredWidth(50);
        tblUsuario.getColumnModel().getColumn(4).setResizable(false);
        tblUsuario.getColumnModel().getColumn(5).setPreferredWidth(80);
        tblUsuario.getColumnModel().getColumn(5).setResizable(false);
        tblUsuario.getColumnModel().getColumn(6).setPreferredWidth(200);
        tblUsuario.getColumnModel().getColumn(6).setResizable(false);        
        }
    
    public void setarCampos(){
        int setar = tblUsuario.getSelectedRow();
        txtIdUsu.setText(tblUsuario.getModel().getValueAt(setar,0).toString());
        txtUsuario.setText(tblUsuario.getModel().getValueAt(setar,1).toString().toUpperCase());
        txtLogUsu.setText(tblUsuario.getModel().getValueAt(setar,2).toString());
        txtSenUsu.setText(tblUsuario.getModel().getValueAt(setar,3).toString());
        cmbPerUsu.setSelectedItem(tblUsuario.getModel().getValueAt(setar,4).toString());               
        txtDatCadUsu.setText(tblUsuario.getModel().getValueAt(setar,5).toString());
        txtResCadUsu.setText(tblUsuario.getModel().getValueAt(setar,6).toString().toUpperCase());
        habilitar();
    }
    
    public void dataatual(){
        Date data = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat();
        formatador.applyPattern("dd/MM/yyyy");
        txtDatCadUsu.setText(formatador.format(data));
    }
    
   
    
}

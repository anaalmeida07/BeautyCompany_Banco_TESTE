/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import Controller.LoginController;
import Model.DAO.Banco;
import Model.DAO.UsuarioDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.DAO.Conexao1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JLabel;
import model.Usuario;


/**
 *
 * @author Fatec
 */
public class Login extends javax.swing.JFrame {

 private final LoginController controller;
 
  
    /**
     * Creates new form Login
     */
   public Login() throws SQLException {
        initComponents();
        //uma variavel controller do tipo LoginController
        controller = new LoginController(this);
        cadastroUsuario telaCadastro = new cadastroUsuario(); // Instância de cadastroUsuario
        LoginController controller = new LoginController(this, telaCadastro);
    
        Banco.inicia();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextUsuario = new javax.swing.JTextField();
        TextSenha = new javax.swing.JPasswordField();
        UsuarioField = new javax.swing.JLabel();
        SenhaField = new javax.swing.JLabel();
        entrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(254, 254, 250));
        setCursor(new java.awt.Cursor(java.awt.Cursor.SE_RESIZE_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextUsuario.setBackground(new java.awt.Color(254, 254, 250));
        TextUsuario.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        TextUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TextUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(TextUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 280, 40));

        TextSenha.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(TextSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 510, 280, 40));

        UsuarioField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        UsuarioField.setForeground(new java.awt.Color(254, 254, 250));
        UsuarioField.setText("Usuário");
        getContentPane().add(UsuarioField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 70, 30));

        SenhaField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        SenhaField.setForeground(new java.awt.Color(254, 254, 250));
        SenhaField.setText("Senha");
        getContentPane().add(SenhaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 70, 20));

        entrar.setBackground(new java.awt.Color(254, 254, 250));
        entrar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        entrar.setText("Entrar");
        entrar.setBorderPainted(false);
        entrar.setContentAreaFilled(false);
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });
        getContentPane().add(entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 570, 120, 30));

        jButton1.setText("Cadastre um Usuário");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, -1, -1));

        fundo.setBackground(new java.awt.Color(254, 254, 250));
        fundo.setForeground(new java.awt.Color(254, 254, 250));
        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/loginBeautyComp.png"))); // NOI18N
        fundo.setText("jLabel2");
        getContentPane().add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 1280, 670));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 260, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextUsuarioActionPerformed

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
     try {
         // executar  quando clicar no botão
         this.controller.entrarNoSistema();
         //this.dispose(); 
     } catch (SQLException ex) {
         Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
     }
         
           
        
        
       
    }//GEN-LAST:event_entrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     try {
         this.controller.navegarParaCadastro();
     } catch (SQLException ex) {
         Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
     }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
                
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Login().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SenhaField;
    private javax.swing.JPasswordField TextSenha;
    private javax.swing.JTextField TextUsuario;
    private javax.swing.JLabel UsuarioField;
    private javax.swing.JButton entrar;
    private javax.swing.JLabel fundo;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public void exibeMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
               
    }
    //para acessar os campos no login controller
    public JPasswordField getTextSenha() {
        return TextSenha;
    }

    public void setTextSenha(JPasswordField TextSenha) {
        this.TextSenha = TextSenha;
    }

    public JTextField getTextUsuario() {
        return TextUsuario;
    }

    public void setTextUsuario(JTextField TextUsuario) {
        this.TextUsuario = TextUsuario;
    }

}


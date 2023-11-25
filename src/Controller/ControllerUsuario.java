/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.DAO.UsuarioDAO;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.SQLException;
import model.DAO.Conexao1;
import model.Usuario;
import view.Login;
import view.MenuPrincipal;
import view.cadastroUsuario;

/**
 *
 * @author crist
 */
public class ControllerUsuario {
    private final cadastroUsuario view;
   
  
   private Connection connection;
     private final UsuarioDAO usuarioDAO;

    public ControllerUsuario(cadastroUsuario tela) throws SQLException {
      
         this.view = tela;
        this.connection = new Conexao1().getConnection(); // Inicializa a conexão aqui
        this.usuarioDAO = new UsuarioDAO(connection); // Inicializa usuarioDAO com a conexão
        
    }
    
   

    public void salvarUsuario() {
        
        try {
            String usuario = view.getIDUsuario().getText();
            String senha = view.getSenhaUsuario().getText();
            Usuario usuario1 = new Usuario(usuario, senha);
            
            Connection conexao;
            
            conexao = new Conexao1().getConnection();
            UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
            usuarioDao.insert(usuario1);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(ControllerUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
 
      
      
    }

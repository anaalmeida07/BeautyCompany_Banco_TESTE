/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.DAO.Conexao1;
import model.Usuario;
import view.Login;
import view.MenuPrincipal;
import view.cadastroUsuario;

/**
 *
 * @author crist
 */

/*uma dica, para quem esta usando a ultima versao do java de 2023 e o netbeans 18, nao usa mais getText na senha, 
pode usar o getPassword que vai da certo e no controller nao colocar String, coloca char[]*/

public class LoginController {

    private final Login view;
    private final cadastroUsuario view1;
    private LoginHelper helper;
    private Connection connection;
    
    //responsavel pela view de login
    public LoginController(Login view) {
        this.view = view; //acessivel de qualquer lugar da classe
        this.helper = new LoginHelper(view);
        
        
    }

    public LoginController(Login view, cadastroUsuario view1) {
        this.view = view;
        this.view1 = view1;
    }

    public LoginController(Login view, Connection connection) {
        this.view = view;
        this.connection = connection;
    }
    
    public void autenticar() throws SQLException{
        //Buscar um usuario da view
         String usuario = view.getTextUsuario().getText();
     String senha = view.getTextSenha().getText();
        Usuario usuarioAutenticar = new Usuario(usuario, senha);
        //Verificar se existe no banco de dados 
          Connection conexao = new Conexao1().getConnection();
            UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
            
            boolean existe = usuarioDao.existeNoBancoPorUsuarioESenha(usuarioAutenticar);
            //SE existir direciona para Menu
            if(existe){
                MenuPrincipal menuPrincipal = new MenuPrincipal();
                menuPrincipal.setVisible(true);
                 this.view.dispose();
            }  else{
                        JOptionPane.showMessageDialog(null, "Usuário ou Senha inválidos!");
                        }
            }
     public void navegarParaCadastro() throws SQLException {
        cadastroUsuario cadastroUser = new cadastroUsuario();
        cadastroUser.setVisible(true);
        this.view1.dispose();
    }


    //nao retorna nada
    public void entrarNoSistema(){
       //Pega um usuario da view
       Usuario usuario = helper.obterModelo();
        //pesquisa o usuario no banco
        UsuarioDAO usuarioDAO = new UsuarioDAO(connection);
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        //se o usuario da view tiver o mesmo usuario e senha que o usuario vindo do banco, redireciona pro menu principal
        if(usuarioAutenticado != null){
            //navegar para menu principal
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.view.dispose();
          // senao mostrar uma mensagem ao usuario "Usuario ou Senha invalidos"
        } else{
             view.exibeMensagem("Usuário ou senha inválidos");
             }
        
    }
}
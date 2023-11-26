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

public class LoginController {

    private final Login view;
    private cadastroUsuario tela;
    private LoginHelper helper;
    private Connection connection;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }

    public LoginController(Login view, cadastroUsuario tela) {
        this.view = view;
        this.tela = tela; 
    }

    public LoginController(Login view, Connection connection) {
        this.view = view;
        this.connection = connection;
    }

    
    
    public void autenticar() throws SQLException {
        String usuario = view.getTextUsuario().getText();
        String senha = view.getTextSenha().getText();
        Usuario usuarioAutenticar = new Usuario(usuario, senha);

        Connection conexao = new Conexao1().getConnection();
       try{
        UsuarioDAO usuarioDao = new UsuarioDAO(conexao);

        boolean existe = usuarioDao.existeNoBancoPorUsuarioESenha(usuarioAutenticar);

        if (existe) {
            MenuPrincipal menuPrincipal = new MenuPrincipal();
            menuPrincipal.setVisible(true);
            this.view.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou Senha inválidos!");
        }
       }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco de dados.");
            e.printStackTrace();
        }
    }

    public void navegarParaCadastro() throws SQLException {
        
        cadastroUsuario cadastroUser = new cadastroUsuario();
        cadastroUser.setVisible(true);
      
    }

    public void entrarNoSistema() throws SQLException {
      //  Usuario usuario = helper.obterModelo();
         String usuario = view.getTextUsuario().getText();
        String senha = view.getTextSenha().getText();
        Usuario usuarioAutenticar = new Usuario(usuario, senha);

        Connection conexao = new Conexao1().getConnection();
         try{
        UsuarioDAO usuarioDao = new UsuarioDAO(conexao);

        boolean existe = usuarioDao.existeNoBancoPorUsuarioESenha(usuarioAutenticar);

        if (existe) {
            MenuPrincipal menuPrincipal = new MenuPrincipal();
            menuPrincipal.setVisible(true);
            this.view.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou Senha inválidos!");
        }
       }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco de dados.");
            e.printStackTrace();
        }
    }



}

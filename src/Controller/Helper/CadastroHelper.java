/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import model.Usuario;
import view.cadastroUsuario;

/**
 *
 * @author crist
 */
public class CadastroHelper implements IHelperUser { //
    //os helpers o que pega os dados da tela e transforma em um modelo ou um modelo em dados na tela
    
    private final cadastroUsuario view;

    public CadastroHelper(cadastroUsuario view) {
        this.view = view;
    }
    
    public Usuario obterModelo(){
        String nome = view.getIDUsuario().getText();
        String senha = view.getSenhaUsuario().getText();
        Usuario modelo1 = new Usuario(0, nome, senha);
    return modelo1;
    }
    
    public void setarModelo(Usuario modelo1)
    {
        String nome = modelo1.getNome();
        String senha = modelo1.getSenha();
        
        view.getIDUsuario().setText(nome);
        view.getSenhaUsuario().setText(senha);
    }
    
    public void limparTela(){
        view.getIDUsuario().setText("");
        view.getSenhaUsuario().setText("");
    }
}

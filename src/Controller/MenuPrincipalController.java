/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.SQLException;
import model.Agendamento;
import view.Cliente;
import view.MenuPrincipal;
import view.agendamento;

/**
 *
 * @author crist
 */
public class MenuPrincipalController {
    
    private final MenuPrincipal view;
    private  Cliente tela;
    
    public MenuPrincipalController(MenuPrincipal view){
        this.view = view;
        
    }

    public MenuPrincipalController(MenuPrincipal view, Cliente tela) {
        this.view = view;
        this.tela = tela;
    }
    
    public void navegarParaAgenda() throws SQLException{
        agendamento agenda = new agendamento();
        agenda.setVisible(true);
        this.view.dispose();
    }
    public void navegarParaCliente() throws SQLException {
        String nome =tela.getNome().getText(); // Obter o nome da view
        String telefone = tela.getTelefone().getText(); // Obter o telefone da view

        // Criar o objeto Cliente com os valores obtidos da view
        Cliente cliente = new Cliente(nome, telefone);
        cliente.setVisible(true);
    }
}

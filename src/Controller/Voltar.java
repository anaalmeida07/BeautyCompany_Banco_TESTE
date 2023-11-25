/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import view.MenuPrincipal;
import view.agendamento;

/**
 *
 * @author crist
 */
public class Voltar {
    //private final MenuPrincipal view;
    private final agendamento view1;

    public Voltar(agendamento view) {
      this.view1=view;
    }

    public void navegarParaMenu(){
       MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.view1.dispose();
    }
}

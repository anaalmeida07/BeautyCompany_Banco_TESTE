/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Controller.AgendaController;
import Controller.Voltar;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;



/**
 *
 * @author crist
 */
public class agendamento extends javax.swing.JFrame {

    private final AgendaController controller;
    private final Voltar controller1;
    
    
    

    /**
     * Creates new form agendamento
     */
    public agendamento() throws SQLException {
        initComponents();
        controller = new AgendaController(this);
        MenuPrincipal MenuPrincipal = null;
        this.controller1 = new Voltar(this);

        iniciar();
        
        
        
    }
    
    public void close(){
        
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);

        }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        valor = new javax.swing.JTextField();
        concluir = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        data = new javax.swing.JTextField();
        cliente = new javax.swing.JComboBox<>();
        servico = new javax.swing.JComboBox<>();
        hora = new javax.swing.JTextField();
        tabelAgendamento = new javax.swing.JScrollPane();
        tabelaAgendamento = new javax.swing.JTable();
        voltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        observacao = new javax.swing.JTextArea();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        valor.setBackground(new java.awt.Color(254, 254, 250));
        getContentPane().add(valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 280, 40));

        concluir.setBackground(new java.awt.Color(254, 254, 250));
        concluir.setText("Concluir");
        concluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concluirActionPerformed(evt);
            }
        });
        getContentPane().add(concluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 570, 140, 40));

        id.setBackground(new java.awt.Color(254, 254, 250));
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 280, 40));

        data.setBackground(new java.awt.Color(254, 254, 250));
        data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataActionPerformed(evt);
            }
        });
        getContentPane().add(data, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 280, 40));

        cliente.setBackground(new java.awt.Color(254, 254, 250));
        cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteActionPerformed(evt);
            }
        });
        getContentPane().add(cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 280, 40));

        servico.setBackground(new java.awt.Color(254, 254, 250));
        servico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                servicoItemStateChanged(evt);
            }
        });
        servico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servicoActionPerformed(evt);
            }
        });
        getContentPane().add(servico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 280, 40));

        hora.setBackground(new java.awt.Color(254, 254, 250));
        hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaActionPerformed(evt);
            }
        });
        getContentPane().add(hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 280, 40));

        tabelaAgendamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "CLIENTE", "SERVIÇO", "VALOR", "DATA", "HORA", "OBSERVAÇÃO"
            }
        ));
        tabelAgendamento.setViewportView(tabelaAgendamento);

        getContentPane().add(tabelAgendamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 160, 610, 410));

        voltar.setBackground(new java.awt.Color(254, 254, 250));
        voltar.setText("voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        getContentPane().add(voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 630, 140, 40));

        observacao.setBackground(new java.awt.Color(254, 254, 250));
        observacao.setColumns(20);
        observacao.setRows(5);
        jScrollPane1.setViewportView(observacao);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 610, 130));

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/tela agendamento.png"))); // NOI18N
        getContentPane().add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1420, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void concluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concluirActionPerformed
      this.controller.agendar();
    }//GEN-LAST:event_concluirActionPerformed

    private void horaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaActionPerformed

    private void dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clienteActionPerformed

    private void servicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_servicoActionPerformed

    private void servicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_servicoItemStateChanged
        this.controller.atualizaValor();
    }//GEN-LAST:event_servicoItemStateChanged

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
       this.controller1.navegarParaMenu();
      
    }//GEN-LAST:event_voltarActionPerformed

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
            java.util.logging.Logger.getLogger(agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new agendamento().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(agendamento.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cliente;
    private javax.swing.JButton concluir;
    private javax.swing.JTextField data;
    private javax.swing.JLabel fundo;
    private javax.swing.JTextField hora;
    private javax.swing.JTextField id;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea observacao;
    private javax.swing.JComboBox<String> servico;
    private javax.swing.JScrollPane tabelAgendamento;
    private javax.swing.JTable tabelaAgendamento;
    private javax.swing.JTextField valor;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables

    private void iniciar() throws SQLException {
    this.controller.AtualizaTabela();
    this.controller.atualizaCliente();
    this.controller.atualizaServico();
    this.controller.atualizaValor();
    
    
    }

    public JTable getTabelaAgendamento() {
        return tabelaAgendamento;
    }

    public void setTabelaAgendamento(JTable tabelaAgendamento) {
        this.tabelaAgendamento = tabelaAgendamento;
    }
    

    public JComboBox<String> getCliente() {
        return cliente;
    }

    public void setCliente(JComboBox<String> cliente) {
        this.cliente = cliente;
    }

    public JComboBox<String> getServico() {
        return servico;
    }

    public void setServico(JComboBox<String> servico) {
        this.servico = servico;
    }

    public JTextField getValor() {
        return valor;
    }

    public void setValor(JTextField valor) {
        this.valor = valor;
    }

    public JTextField getData() {
        return data;
    }

    public void setData(JTextField data) {
        this.data = data;
    }
    public String getDataFormatada(){
        return new SimpleDateFormat("dd/MM/yyyy").format(data);
    }
    public String getHoraFormatada(){
        return new SimpleDateFormat("HH:mm").format(data);
    }

    public JTextField getHora() {
        return hora;
    }

    public void setHora(JTextField hora) {
        this.hora = hora;
    }

    public JTextField getId() {
        return id;
    }

    public void setId(JTextField id) {
        this.id = id;
    }

    public JTextArea getObservacao() {
        return observacao;
    }

    public void setObservacao(JTextArea observacao) {
        this.observacao = observacao;
    }

    
    

 

   

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Classes.AlimentarLista;
import Classes.FundoTela;
import java.awt.GridLayout;

public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public TelaPrincipal() {
        initComponents();
        
        //Populando Lista
        AlimentarLista.chamar();
        
        //Maximizando tela de menu
        this.setExtendedState(MAXIMIZED_BOTH);
        
        //add fundo na tela
        setLayout(new GridLayout());
        FundoTela tela = new FundoTela("src/Imagens/fundo.jpg");
        getContentPane().add(tela);
        //fim

    }
   
    //Menu.setVisible(false);
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        Menu = new javax.swing.JMenuBar();
        menuCadCliente = new javax.swing.JMenu();
        menuCliente = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        subMenuExercicos = new javax.swing.JMenuItem();
        menuPagamento = new javax.swing.JMenu();
        SubPagamento = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenuItem2.setText("jMenuItem2");

        jMenu5.setText("jMenu5");

        jMenu6.setText("jMenu6");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Principal");

        menuCadCliente.setText("Cadastros");
        menuCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadClienteActionPerformed(evt);
            }
        });

        menuCliente.setText("Cliente");
        menuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClienteActionPerformed(evt);
            }
        });
        menuCadCliente.add(menuCliente);

        jMenuItem1.setText("Professor");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuCadCliente.add(jMenuItem1);

        Menu.add(menuCadCliente);

        jMenu2.setText("Exercícios");

        subMenuExercicos.setText("Montar Treino");
        subMenuExercicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuExercicosActionPerformed(evt);
            }
        });
        jMenu2.add(subMenuExercicos);

        Menu.add(jMenu2);

        menuPagamento.setText("Pagamentos");
        menuPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPagamentoActionPerformed(evt);
            }
        });

        SubPagamento.setText("Receber Pagamento");
        SubPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubPagamentoActionPerformed(evt);
            }
        });
        menuPagamento.add(SubPagamento);

        Menu.add(menuPagamento);

        jMenu7.setText("Relatórios");

        jMenuItem3.setText("Relatório de Clientes");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem3);

        Menu.add(jMenu7);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 912, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
//    IntefaceCadCliente cliente =  new IntefaceCadCliente();
//    TelaPagamentos pagamento = new TelaPagamentos();
//    InterfaceCadProfessor prof =  new InterfaceCadProfessor();
//    Exercicios exercicio = new Exercicios();
//    Relatorios relatorio = new Relatorios();
//    


    private void menuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClienteActionPerformed
      IntefaceCadCliente cliente =  new IntefaceCadCliente();
      cliente.setVisible(true);
      cliente.setLocationRelativeTo(null);  
    }//GEN-LAST:event_menuClienteActionPerformed

    private void menuCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuCadClienteActionPerformed

    private void menuPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPagamentoActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_menuPagamentoActionPerformed

    private void SubPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubPagamentoActionPerformed
        TelaPagamentos pagamento = new TelaPagamentos();
        pagamento.setVisible(true);
        pagamento.setLocationRelativeTo(null);   
    }//GEN-LAST:event_SubPagamentoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       InterfaceCadProfessor prof =  new InterfaceCadProfessor();
       prof.setVisible(true);
       prof.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void subMenuExercicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuExercicosActionPerformed
        Exercicios exercicio = new Exercicios();
        exercicio.setVisible(true);
        exercicio.setLocationRelativeTo(null);    
    }//GEN-LAST:event_subMenuExercicosActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Relatorios relatorio = new Relatorios();
        relatorio.setVisible(true);
        relatorio.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenuItem SubPagamento;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenu menuCadCliente;
    private javax.swing.JMenuItem menuCliente;
    private javax.swing.JMenu menuPagamento;
    private javax.swing.JMenuItem subMenuExercicos;
    // End of variables declaration//GEN-END:variables

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import Classes.Metodos;
import Classes.CadastroCliente;
import Classes.Metodos;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis
 */
public class Relatorios extends javax.swing.JFrame {

    /**
     * Creates new form Relatorios
     */
    public Relatorios() {
        initComponents();
        //inicializando situacao
        Metodos.Situacao();
        //desativando botao status
        JbLimpar.setEnabled(false);
//        //listar todos
//        BuscarTodos();
        //impede o redimencionamento do frame
        setResizable(false);
    }
    
    //lista clonada
    public static ArrayList<CadastroCliente> Novo = new ArrayList<CadastroCliente>(CadastroCliente.vetCadastro);
    
    //dia de pagamento
    public static LocalDate diaPagamento(int x){
        
        LocalDate ultimoPag = Novo.get(x).getDataDoCadastro();

        int ano = ultimoPag.getYear();
        int mes = ultimoPag.getMonthValue();
        int dia = ultimoPag.getDayOfMonth();
        
            //verificando se está em Dezembro e trocando o ano do dia de pagamento
            if(mes == 12){
                ano = ultimoPag.getYear()+1;
                mes = 1;
            }else{
                mes = mes+1;
            }
            
        return LocalDate.of(ano, mes, dia);
    }
    //metodo para filtrar top dez
    public void topDez(String filtro){
        
        DefaultTableModel dtm = (DefaultTableModel) jTableRelatorios.getModel();
        dtm.setRowCount(0);
        
        Collections.sort(Novo);
        
        int cont = 0;
        for(int i = 0; i < Novo.size(); i++) {
            if(Novo.get(i).getStatus().equals(filtro) && cont <10){
                cont++;
                dtm.addRow(new Object[] {
                    Novo.get(i).getId(),
                    Novo.get(i).getNome(),
                    Novo.get(i).getCpf(),
                    Metodos.formatarDatas(Novo.get(i).getDataDoCadastro()),
                    Metodos.formatarDatas(diaPagamento(i)),
                    Novo.get(i).getStatus()
                }
                );
                
            }
        }
        if(cont == 0){
            JOptionPane.showMessageDialog(rootPane, "Não foram encontrados dados com esse status!!!");
        }else{
            JbLimpar.setEnabled(true);
        }
    }
    
    //buscar todos os clientes cadastrados
    public void BuscarTodos(){
        DefaultTableModel dtm = (DefaultTableModel) jTableRelatorios.getModel();
        dtm.setRowCount(0);
        
        int cont  = 0;
        
        for(int i = 0; i < CadastroCliente.vetCadastro.size(); i++){
                cont++;
                
                dtm.addRow(new Object[] {
                    CadastroCliente.vetCadastro.get(i).getId(),
                    CadastroCliente.vetCadastro.get(i).getNome(),
                    CadastroCliente.vetCadastro.get(i).getCpf(),
                    Metodos.formatarDatas(CadastroCliente.vetCadastro.get(i).getDataDoCadastro()),
                    Metodos.formatarDatas(Metodos.diaPagamento(i)),
                    CadastroCliente.vetCadastro.get(i).getStatus()
                }
            );
        }
        if(cont == 0){
            JOptionPane.showMessageDialog(rootPane, "Não foram encontrados dados com esse status!!!");
        }else{
            JbLimpar.setEnabled(true);
        }
    }
    //buscar situacao
    public void Buscar(String filtro){
        DefaultTableModel dtm = (DefaultTableModel) jTableRelatorios.getModel();
        dtm.setRowCount(0);
        
        int cont  = 0;
        
        for(int i = 0; i < CadastroCliente.vetCadastro.size(); i++){
            if(CadastroCliente.vetCadastro.get(i).getStatus().equals(filtro)){
                cont++;
                
                dtm.addRow(new Object[] {
                    CadastroCliente.vetCadastro.get(i).getId(),
                    CadastroCliente.vetCadastro.get(i).getNome(),
                    CadastroCliente.vetCadastro.get(i).getCpf(),
                    Metodos.formatarDatas(CadastroCliente.vetCadastro.get(i).getDataDoCadastro()),
                    Metodos.formatarDatas(Metodos.diaPagamento(i)),
                    CadastroCliente.vetCadastro.get(i).getStatus()
                }
            );
                
            }
        }
        if(cont == 0){
            JOptionPane.showMessageDialog(rootPane, "Não foram encontrados dados com esse status!!!");
            JbLimpar.setEnabled(false);
        }else{
            JbLimpar.setEnabled(true);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        BgRelatoriosFiltro = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableRelatorios = new javax.swing.JTable();
        JbGerar = new javax.swing.JButton();
        JcbTopList = new javax.swing.JCheckBox();
        JbLimpar = new javax.swing.JButton();
        JrbEmDia = new javax.swing.JRadioButton();
        JrbPendente = new javax.swing.JRadioButton();
        JrbInativo = new javax.swing.JRadioButton();
        JrbTodos = new javax.swing.JRadioButton();

        jCheckBox1.setText("jCheckBox1");

        jCheckBox2.setText("jCheckBox2");

        jRadioButton2.setText("Em dia");

        jRadioButton1.setText("Inativos");

        jRadioButton3.setText("Pendentes");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Academia");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Relatórios");

        jTableRelatorios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "CPF", "ULTIMO PAGAMENTO", "VENCIMENTO", "SITUAÇÃO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableRelatorios.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTableRelatorios);

        JbGerar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JbGerar.setText("Gerar");
        JbGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbGerarActionPerformed(evt);
            }
        });

        JcbTopList.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JcbTopList.setForeground(new java.awt.Color(255, 51, 51));
        JcbTopList.setText("Top 10");
        JcbTopList.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JcbTopListItemStateChanged(evt);
            }
        });
        JcbTopList.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JcbTopListFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JcbTopListFocusLost(evt);
            }
        });
        JcbTopList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JcbTopListMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JcbTopListMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JcbTopListMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JcbTopListMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JcbTopListMouseReleased(evt);
            }
        });
        JcbTopList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcbTopListActionPerformed(evt);
            }
        });

        JbLimpar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JbLimpar.setText("Limpar");
        JbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbLimparActionPerformed(evt);
            }
        });

        BgRelatoriosFiltro.add(JrbEmDia);
        JrbEmDia.setText("Em dia");

        BgRelatoriosFiltro.add(JrbPendente);
        JrbPendente.setText("Pendente");

        BgRelatoriosFiltro.add(JrbInativo);
        JrbInativo.setText("Inativo");

        BgRelatoriosFiltro.add(JrbTodos);
        JrbTodos.setSelected(true);
        JrbTodos.setText("Todos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JcbTopList)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(JrbEmDia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JrbPendente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JrbInativo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JrbTodos)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JbGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(JbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(365, 365, 365)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 63, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JbGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JrbEmDia)
                                    .addComponent(JrbPendente)
                                    .addComponent(JrbTodos)
                                    .addComponent(JrbInativo))
                                .addGap(15, 15, 15)
                                .addComponent(JcbTopList)
                                .addGap(18, 18, 18)))))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JbGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbGerarActionPerformed
        
        //Relatorio 'Em dia'
        if(JrbEmDia.isSelected() && JcbTopList.isSelected()){
            topDez("Em dia");
        }else if(JrbEmDia.isSelected()){
            Buscar("Em dia");
        }
        
        //Relatorio 'Pendente'
        if(JrbPendente.isSelected() && JcbTopList.isSelected()){
            topDez("Pendente");
        }else if(JrbPendente.isSelected()){
            Buscar("Pendente");
        }
        
        //Relatorio 'Inativo'
        if(JrbInativo.isSelected() && JcbTopList.isSelected()){
            topDez("Inativo");
        }else if(JrbInativo.isSelected()){
            Buscar("Inativo");
        }
        
        //validando e mostrando o todos
        if(JrbTodos.isSelected() && JcbTopList.isSelected()){
           
            //Limpando Tabela
            DefaultTableModel dtm = (DefaultTableModel) jTableRelatorios.getModel();
            dtm.setRowCount(0);
            //Fim
            
            JOptionPane.showMessageDialog(rootPane, "NÃO EH POSSÍVEL UTILIZAR O TOP DEZ!!!\nTENTE COM OUTRO FILTRO!!!");
            
        }else if(JrbTodos.isSelected()){
            BuscarTodos();
        }
        
    }//GEN-LAST:event_JbGerarActionPerformed

    private void JbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbLimparActionPerformed
        DefaultTableModel dtm = (DefaultTableModel)jTableRelatorios.getModel();
        dtm.setNumRows(0);
        JOptionPane.showMessageDialog(rootPane, "Tabela limpa com sucesso!!!");
        JbLimpar.setEnabled(false);
    }//GEN-LAST:event_JbLimparActionPerformed

    private void JcbTopListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcbTopListActionPerformed
       
    }//GEN-LAST:event_JcbTopListActionPerformed

    private void JcbTopListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JcbTopListMouseClicked
        
    }//GEN-LAST:event_JcbTopListMouseClicked

    private void JcbTopListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JcbTopListMouseExited
       
    }//GEN-LAST:event_JcbTopListMouseExited

    private void JcbTopListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JcbTopListMouseEntered
        
    }//GEN-LAST:event_JcbTopListMouseEntered

    private void JcbTopListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JcbTopListMousePressed
        
    }//GEN-LAST:event_JcbTopListMousePressed

    private void JcbTopListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JcbTopListMouseReleased
         
    }//GEN-LAST:event_JcbTopListMouseReleased

    private void JcbTopListItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JcbTopListItemStateChanged
       
    }//GEN-LAST:event_JcbTopListItemStateChanged

    private void JcbTopListFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JcbTopListFocusGained
        
    }//GEN-LAST:event_JcbTopListFocusGained

    private void JcbTopListFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JcbTopListFocusLost

    }//GEN-LAST:event_JcbTopListFocusLost

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
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatorios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BgRelatoriosFiltro;
    private javax.swing.JButton JbGerar;
    private javax.swing.JButton JbLimpar;
    private javax.swing.JCheckBox JcbTopList;
    private javax.swing.JRadioButton JrbEmDia;
    private javax.swing.JRadioButton JrbInativo;
    private javax.swing.JRadioButton JrbPendente;
    private javax.swing.JRadioButton JrbTodos;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableRelatorios;
    // End of variables declaration//GEN-END:variables
}

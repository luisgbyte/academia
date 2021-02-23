/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import Classes.Metodos;
import Classes.CadastroCliente;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.time.temporal.ChronoUnit;


public class TelaPagamentos extends javax.swing.JFrame {
    public boolean pagamento;
    /**
     * Creates new form Pagamentos
     */
    public TelaPagamentos() {
        initComponents();
        MostrarTodos();
        btnReceber.setEnabled(false);
        btnCancelar.setEnabled(false);
        
        //impede o redimencionamento do frame
        setResizable(false);
        
    }
    //mostra todos os dados cadastrados
    public void MostrarTodos(){
        //limpar tabela
        DefaultTableModel dtm = (DefaultTableModel) jTablePagamentos.getModel();
        dtm.setNumRows(0);
        
        for(int x = 0; x < CadastroCliente.vetCadastro.size(); x++){
        
        LocalDate ultimoPag = CadastroCliente.vetCadastro.get(x).getDataDoCadastro(); 
        
        LocalDate dataAtual = LocalDate.now();
        
        LocalDate dia_pag = Metodos.diaPagamento(x);
        
        long comparacao = ultimoPag.until(dataAtual.minusDays(1), ChronoUnit.DAYS);
        
          //String status = "Em dia";
          double mensalidade = 60.0;

              if(comparacao > 25 && comparacao <= 30){
                  CadastroCliente.vetCadastro.get(x).setStatus("Pendente");  
              }else if(comparacao > 30){
                  CadastroCliente.vetCadastro.get(x).setStatus("Inativo");  
              }
              
            dtm.addRow(new Object[] {CadastroCliente.vetCadastro.get(x).getId(), CadastroCliente.vetCadastro.get(x).getNome(), Metodos.formatarDatas(CadastroCliente.vetCadastro.get(x).getDataDoCadastro()), Metodos.formatarDatas(dia_pag), CadastroCliente.vetCadastro.get(x).getStatus()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BgFiltro = new javax.swing.ButtonGroup();
        BgOpcao = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePagamentos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtBusca = new javax.swing.JTextField();
        JrbNome = new javax.swing.JRadioButton();
        JrbId = new javax.swing.JRadioButton();
        JcbStatus = new javax.swing.JComboBox<>();
        JrbTodos = new javax.swing.JRadioButton();
        btnReceber = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Academia");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Pagamentos");

        jTablePagamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "ULTIMO PAGAMENTO", "VENCIMENTO", "SITUAÇÃO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePagamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePagamentosMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTablePagamentosMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePagamentos);

        jLabel2.setText("Buscar:");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pesquisar.png"))); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel4.setText("Filtrar status por:");

        txtBusca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBuscaFocusLost(evt);
            }
        });
        txtBusca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscaMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtBuscaMouseReleased(evt);
            }
        });
        txtBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaActionPerformed(evt);
            }
        });
        txtBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaKeyReleased(evt);
            }
        });

        BgOpcao.add(JrbNome);
        JrbNome.setSelected(true);
        JrbNome.setText("Nome");
        JrbNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JrbNomeMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JrbNomeMouseReleased(evt);
            }
        });

        BgOpcao.add(JrbId);
        JrbId.setText("Id");
        JrbId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JrbIdMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JrbIdMouseReleased(evt);
            }
        });

        JcbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Em dia", "Pendente", "Inativo" }));

        BgOpcao.add(JrbTodos);
        JrbTodos.setText("Todos");
        JrbTodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JrbTodosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JrbTodosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JrbTodosMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JrbTodosMouseReleased(evt);
            }
        });

        btnReceber.setText("RECEBER");
        btnReceber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceberActionPerformed(evt);
            }
        });

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JrbNome)
                                .addGap(3, 3, 3)
                                .addComponent(JrbId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JrbTodos))
                            .addComponent(txtBusca))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JcbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReceber, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(285, 285, 285))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JrbNome)
                            .addComponent(JrbId)
                            .addComponent(JrbTodos))
                        .addGap(4, 4, 4)
                        .addComponent(JcbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnReceber, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    int ocorreu_validacao = 0;
    public void validarCampoString(javax.swing.JTextField campo){        
        
        if(!campo.getText().equals("") && campo.getText().matches("[a-zA-Z\\u00C0-\\u00FF ]+")){   
            ocorreu_validacao = 1;
        }else{
            campo.requestFocus();
            JOptionPane.showMessageDialog(null, "Campos não preenchidos ou possui caracteres inválidos!!!");
        }
    } 
    public void validarCampoInt(javax.swing.JTextField campo){
        
        if(!campo.getText().equals("") && campo.getText().matches("[0-9]+") && campo.getText().length() < 4){
            ocorreu_validacao = 1;
        }else{
            campo.requestFocus();
            JOptionPane.showMessageDialog(null, "Campos não preenchidos ou possui caracteres inválidos!!!");
        }
    }
    
    public void buscaListaId(String busca, int id){
        DefaultTableModel dtm = (DefaultTableModel) jTablePagamentos.getModel();
        dtm.setRowCount(0);
        
        int cont = 0;
        for(int i = 0; i < CadastroCliente.vetCadastro.size(); i++){  
            if(CadastroCliente.vetCadastro.get(i).getId() == id && CadastroCliente.vetCadastro.get(i).getStatus().equals(busca)){
                cont++;
                dtm.addRow(new Object[] {CadastroCliente.vetCadastro.get(i).getId(), CadastroCliente.vetCadastro.get(i).getNome(), Metodos.formatarDatas(CadastroCliente.vetCadastro.get(i).getDataDoCadastro()), Metodos.formatarDatas(Metodos.diaPagamento(i)), CadastroCliente.vetCadastro.get(i).getStatus()});
            }
        }
        if(cont == 0){
            JOptionPane.showMessageDialog(rootPane, "Dados não encontrados!!!");
        }
    }
    public void buscaListaNome(String busca, String nome){
        DefaultTableModel dtm = (DefaultTableModel) jTablePagamentos.getModel();
        dtm.setRowCount(0);
        
        int cont  = 0;
        for(int i = 0; i < CadastroCliente.vetCadastro.size(); i++){
            if(CadastroCliente.vetCadastro.get(i).getNome().equals(nome) && CadastroCliente.vetCadastro.get(i).getStatus().equals(busca)){
                cont++;
                dtm.addRow(new Object[] {CadastroCliente.vetCadastro.get(i).getId(), CadastroCliente.vetCadastro.get(i).getNome(), Metodos.formatarDatas(CadastroCliente.vetCadastro.get(i).getDataDoCadastro()), Metodos.formatarDatas(Metodos.diaPagamento(i)), CadastroCliente.vetCadastro.get(i).getStatus()});
            }
        }
        if(cont == 0){
            JOptionPane.showMessageDialog(rootPane, "Dados não encontrados!!!");
        }
    } 
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
   
        if(btnBuscar.getText().equals("Buscar")){
            if(JrbNome.isSelected()){
                validarCampoString(txtBusca);
            }
            if(JrbId.isSelected()){
                validarCampoInt(txtBusca);
            }
            if(JrbTodos.isSelected()){
                MostrarTodos();
            }
            if(ocorreu_validacao == 1){

                //busca nome
                if(JrbNome.isSelected() && JcbStatus.getSelectedIndex() == 1){
                    buscaListaNome("Pendente", txtBusca.getText());
                }
                if(JrbNome.isSelected() && JcbStatus.getSelectedIndex() == 0){
                    buscaListaNome("Em dia", txtBusca.getText());
                }
                if(JrbNome.isSelected() && JcbStatus.getSelectedIndex() == 2){     
                     buscaListaNome("Inativo", txtBusca.getText());
                }
                //busca id
                if(JrbId.isSelected() && JcbStatus.getSelectedIndex() == 1){  
                    //vai precisar usar tratamento de erros e exceções --- no part do campo txt
                    buscaListaId("Pendente", Integer.parseInt(txtBusca.getText()));
                }
                if(JrbId.isSelected() && JcbStatus.getSelectedIndex() == 0){     
                     buscaListaId("Em dia", Integer.parseInt(txtBusca.getText()));
                }
                if(JrbId.isSelected() && JcbStatus.getSelectedIndex() == 2){     
                     buscaListaId("Inativo", Integer.parseInt(txtBusca.getText()));
                }
                ocorreu_validacao = 0;
         } 
          
        }
//        else if(btnBuscar.getText().equals("Receber")){
//            
//            gerarPdf pdf = new gerarPdf();
//            pdf.setVisible(true);
//            
//        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jTablePagamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePagamentosMouseClicked
        jTablePagamentos.setEnabled(true);
    }//GEN-LAST:event_jTablePagamentosMouseClicked
    public void Pagamento(String status, LocalDate ultimoPag, int pos, int id){
        
        LocalDate dataAtual = LocalDate.now();   

        int dia = dataAtual.getDayOfMonth();
        int ano = dataAtual.getYear();
        int mes = dataAtual.getMonthValue();

        long comparacao = ultimoPag.until(dataAtual.minusDays(1), ChronoUnit.DAYS);
        double mensalidade = 60.0;
        
        if(!status.equals("Em dia")){
                  if(status.equals("Pendente")){
                      
                      String opcoes[] = new String[]{"Sim", "Cancelar"};
                      int i = JOptionPane.showOptionDialog(null, "REALIZAR PAGAMENTO?"+"\n\nCLIENTE: "+CadastroCliente.vetCadastro.get(id).getNome().toUpperCase()+"\nVALOR: R$"+mensalidade, "Atenção", -1, -1, null, opcoes, 0);
                      
                      if (i == 0){
                        //modificando na lista
                        CadastroCliente.vetCadastro.get(id).setStatus("Em dia");
                        ultimoPag = LocalDate.of(ano, mes, dia);
                        CadastroCliente.vetCadastro.get(id).setDataDoCadastro(ultimoPag); 

                        //novo ultimo pagamento
                        jTablePagamentos.setValueAt(Metodos.formatarDatas(ultimoPag), pos, 2);
                        //novo dia de pagamento
                        jTablePagamentos.setValueAt(Metodos.formatarDatas(Metodos.diaPagamento(id)), pos, 3);
                        //novo status
                        jTablePagamentos.setValueAt("Em dia", pos, 4);
                        JOptionPane.showMessageDialog(null, "Pagamento recebido com sucesso!");
                    }
                  }else if(status.equals("Inativo")){             
                      double aux = comparacao - 30;
                      
                      if(comparacao <= 60){
                          mensalidade = mensalidade  + 2 * aux;
                      }
                      if(comparacao > 60){
                          mensalidade = mensalidade + 60;
                      }
                      //JOptionPane.showMessageDialog(null, "CLIENTE: "+CadastroCliente.vetCadastro.get(pos).getNome()+"\nVALOR MENSALIDADE: R$"+mensalidade);
                      String opcoes[] = new String[]{"Sim", "Cancelar"};
                      int i = JOptionPane.showOptionDialog(null, "REALIZAR PAGAMENTO?"+"\n\nCLIENTE: "+CadastroCliente.vetCadastro.get(id).getNome().toUpperCase()+"\nVALOR: R$"+mensalidade, "Atenção", -1, -1, null, opcoes, 0);
                      
                      if (i == 0){
                            //modificando na lista
                            CadastroCliente.vetCadastro.get(id).setStatus("Em dia");  
                            ultimoPag = LocalDate.of(ano, mes, dia);
                            CadastroCliente.vetCadastro.get(id).setDataDoCadastro(ultimoPag);

                            //novo ultimo pagamento
                            jTablePagamentos.setValueAt(Metodos.formatarDatas(ultimoPag), pos, 2);
                            //novo dia de pagamento
                            jTablePagamentos.setValueAt(Metodos.formatarDatas(Metodos.diaPagamento(id)), pos, 3);
                            //novo status
                            jTablePagamentos.setValueAt("Em dia", pos, 4);
                            JOptionPane.showMessageDialog(null, "Pagamento recebido com sucesso!");
                      }
                  }
        }else{
            JOptionPane.showMessageDialog(null, "NÃO É POSSÍVEL REALIZAR PAGAMENTO!!!\n(STATUS EM DIA)\nULTIMO PAGAMENTO: "+Metodos.formatarDatas(ultimoPag));
        }    
    }
    
    private void jTablePagamentosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePagamentosMouseReleased
              btnReceber.setEnabled(true);
              btnBuscar.setEnabled(false);
              btnCancelar.setEnabled(true);
              txtBusca.setEnabled(false);
              txtBusca.setText("");
              JcbStatus.setEnabled(false);
              JrbTodos.setEnabled(false);
              JrbNome.setEnabled(false);
              JrbId.setEnabled(false);
    }//GEN-LAST:event_jTablePagamentosMouseReleased
    
    private void txtBuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaKeyReleased
      
    }//GEN-LAST:event_txtBuscaKeyReleased

    private void txtBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaActionPerformed
   
    private void txtBuscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscaMouseClicked
        
    }//GEN-LAST:event_txtBuscaMouseClicked

    private void txtBuscaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscaFocusLost
       
    }//GEN-LAST:event_txtBuscaFocusLost

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        ///aqui
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void txtBuscaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscaMouseReleased
        btnBuscar.setEnabled(true);
        btnBuscar.setText("Buscar");
        txtBusca.setText("");
        JrbId.setSelected(false);
        JrbNome.setSelected(false);
        JcbStatus.setSelectedIndex(0);
        //JrbPendentes.setSelected(false);
        //JrbEmdia.setSelected(false);
        //jTablePagamentos.getSelectedRow();
    }//GEN-LAST:event_txtBuscaMouseReleased

    private void JrbTodosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JrbTodosMouseClicked
        
    }//GEN-LAST:event_JrbTodosMouseClicked

    private void JrbTodosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JrbTodosMouseExited

    }//GEN-LAST:event_JrbTodosMouseExited

    private void JrbTodosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JrbTodosMousePressed

    }//GEN-LAST:event_JrbTodosMousePressed

    private void JrbIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JrbIdMouseClicked

    }//GEN-LAST:event_JrbIdMouseClicked

    private void JrbNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JrbNomeMouseClicked
        
    }//GEN-LAST:event_JrbNomeMouseClicked

    private void JrbTodosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JrbTodosMouseReleased
        txtBusca.setEnabled(false);
        JrbId.setEnabled(true);
        JrbNome.setEnabled(true);
        JcbStatus.setEnabled(false);
    }//GEN-LAST:event_JrbTodosMouseReleased

    private void JrbIdMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JrbIdMouseReleased
       txtBusca.setEnabled(true);
       JcbStatus.setEnabled(true);
    }//GEN-LAST:event_JrbIdMouseReleased

    private void JrbNomeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JrbNomeMouseReleased
       txtBusca.setEnabled(true);
       JcbStatus.setEnabled(true);
    }//GEN-LAST:event_JrbNomeMouseReleased

    private void btnReceberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceberActionPerformed
   
            int linhaSel = jTablePagamentos.getSelectedRow();
            int id = Integer.parseInt(jTablePagamentos.getValueAt(linhaSel, 0).toString())-1;

            String Status = CadastroCliente.vetCadastro.get(id).getStatus();
            LocalDate date = CadastroCliente.vetCadastro.get(id).getDataDoCadastro();

            //função de pagamento
            Pagamento(Status, date, linhaSel, id);
            
            //modificando status de campos
            JcbStatus.setEnabled(true);
            txtBusca.setEnabled(true);
            JrbTodos.setEnabled(true);
            JrbNome.setEnabled(true);
            JrbId.setEnabled(true);
            //botao        
            btnReceber.setEnabled(false);
            btnBuscar.setEnabled(true);
            btnCancelar.setEnabled(false);
            //mostrar todos os itens da tabela
            MostrarTodos();
    }//GEN-LAST:event_btnReceberActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        btnReceber.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnBuscar.setEnabled(true);
        txtBusca.setEnabled(true);
        JcbStatus.setEnabled(true);
        JrbTodos.setEnabled(true);
        JrbNome.setEnabled(true);
        JrbId.setEnabled(true);
        MostrarTodos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    }//GEN-LAST:event_formWindowClosing

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated

    }//GEN-LAST:event_formWindowDeactivated
    
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
            java.util.logging.Logger.getLogger(TelaPagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPagamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BgFiltro;
    private javax.swing.ButtonGroup BgOpcao;
    private javax.swing.JComboBox<String> JcbStatus;
    private javax.swing.JRadioButton JrbId;
    private javax.swing.JRadioButton JrbNome;
    private javax.swing.JRadioButton JrbTodos;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnReceber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePagamentos;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
}
